# Useful Links

* [Python SDK Page](https://developer.squareup.com/docs/sdks/python)
* [Payments API Overview](https://developer.squareup.com/docs/payments)
* [Payments in the API Reference](https://developer.squareup.com/reference/square/payments-api)

# Payment processing example: Python

This sample demonstrates processing card payments with Square Connect API, using the
Square Connect Python client library.

## Requirements

Make sure you have Python 3 >= 3.4

## Setup

### Install the Python client library

1. Make sure you have Python 3 >= 3.4 installed from [python.org](https://www.python.org/).

2. Run the following command to install `squareup` package and other dependencies:

    `pip install -r requirements.txt`

### Provide required credentials

Replace all your credentials in `config.ini`. Note that there's sandbox and
production credentials. Use `is_prod` (true/false) to choose between them.
Do not use quotes around the strings in the `config.ini` file.
(**WARNING**: never upload `config.ini` with your credentials/access_token.)

If you're just testing things out, it's recommended that you use your _sandbox_
credentials for now. See
[this article](https://docs.connect.squareup.com/articles/using-sandbox/)
for more information on the API sandbox.

## Running the sample

From the sample's root directory, run:

    uvicorn main:app --reload

You can then visit `localhost:8000` in your browser to see the card form.

If you're using your sandbox credentials, you can test a valid credit card
transaction by providing the following card information in the form:

* Card Number 4111 1111 1111 1111
* Card CVV 111
* Card Expiration (Any time in the future)
* Card Postal Code (Any valid US postal code)

You can find more testing values in this [article](https://docs.connect.squareup.com/articles/using-sandbox)

**Note that if you are _not_ using your sandbox credentials and you enter _real_
credit card information, YOU WILL CHARGE THE CARD.**

```	