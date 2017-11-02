/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.squareup.connectexamples.ecommerce;

import com.squareup.connect.ApiClient;
import com.squareup.connect.ApiException;
import com.squareup.connect.Configuration;
import com.squareup.connect.api.LocationsApi;
import com.squareup.connect.api.TransactionsApi;
import com.squareup.connect.auth.OAuth;
import com.squareup.connect.models.ChargeRequest;
import com.squareup.connect.models.ChargeResponse;
import com.squareup.connect.models.Location;
import com.squareup.connect.models.Location.CapabilitiesEnum;
import com.squareup.connect.models.Money;
import com.squareup.connect.models.Money.CurrencyEnum;
import java.util.Map;
import java.util.UUID;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Main {
    // The environment variable containing a Square Personal Access Token.
    // This must be set in order for the application to start.
    private static final String SQUARE_ACCESS_TOKEN_ENV_VAR = "SQUARE_ACCESS_TOKEN";

    // The environment variable containing a Square application ID.
    // This must be set in order for the application to start.
    private static final String SQUARE_APP_ID_ENV_VAR = "SQUARE_APP_ID";

    private final ApiClient squareClient = Configuration.getDefaultApiClient();
    private final Location squareLocation;
    private final String squareAppId;

    public Main() throws ApiException {
        squareAppId = mustLoadEnvironmentVariable(SQUARE_APP_ID_ENV_VAR);

        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) squareClient.getAuthentication("oauth2");
        oauth2.setAccessToken(mustLoadEnvironmentVariable(SQUARE_ACCESS_TOKEN_ENV_VAR));

        squareLocation = lookupCardProcessingLocation();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

    private String mustLoadEnvironmentVariable(String name) {
        String value = System.getenv(name);
        if (value == null || value.length() == 0) {
            throw new IllegalStateException(
                String.format("The %s environment variable must be set", name));
        }

        return value;
    }

    @RequestMapping("/")
    String index(Map<String, Object> model) throws ApiException {
        model.put("locationId", squareLocation.getId());
        model.put("locationName", squareLocation.getName());
        model.put("addId", squareAppId);

        return "index";
    }

    @PostMapping("/charge")
    String charge(@ModelAttribute NonceForm form, Map<String, Object> model) throws ApiException {
        // To learn more about splitting transactions with additional recipients,
        // see the Transactions API documentation on our [developer site]
        // (https://docs.connect.squareup.com/payments/transactions/overview#mpt-overview).
        ChargeRequest chargeRequest = new ChargeRequest()
            .idempotencyKey(UUID.randomUUID().toString())
            .amountMoney(new Money().amount(1_00L).currency(CurrencyEnum.USD))
            .cardNonce(form.getNonce())
            .note("From a Square sample Java app");

        TransactionsApi transactionsApi = new TransactionsApi();
        transactionsApi.setApiClient(squareClient);

        ChargeResponse response = transactionsApi.charge(squareLocation.getId(), chargeRequest);

        model.put("transactionId", response.getTransaction().getId());

        return "charge";
    }

    private Location lookupCardProcessingLocation() throws ApiException {
        LocationsApi locationsApi = new LocationsApi();
        locationsApi.setApiClient(squareClient);

        return locationsApi.listLocations().getLocations().stream()
            .filter(l -> l.getCapabilities().contains(CapabilitiesEnum.PROCESSING))
            .findFirst()
            .orElseThrow(() -> new IllegalStateException(
                "At least one location must support card processing"));
    }
}
