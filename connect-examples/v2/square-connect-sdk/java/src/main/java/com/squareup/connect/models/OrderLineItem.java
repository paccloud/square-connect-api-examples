/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.Money;
import com.squareup.connect.models.OrderLineItemAppliedDiscount;
import com.squareup.connect.models.OrderLineItemAppliedTax;
import com.squareup.connect.models.OrderLineItemDiscount;
import com.squareup.connect.models.OrderLineItemModifier;
import com.squareup.connect.models.OrderLineItemTax;
import com.squareup.connect.models.OrderQuantityUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a line item in an order. Each line item describes a different product to purchase, with its own quantity and price details.
 */
@ApiModel(description = "Represents a line item in an order. Each line item describes a different product to purchase, with its own quantity and price details.")

public class OrderLineItem {
  @JsonProperty("uid")
  private String uid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("quantity")
  private String quantity = null;

  @JsonProperty("quantity_unit")
  private OrderQuantityUnit quantityUnit = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("catalog_object_id")
  private String catalogObjectId = null;

  @JsonProperty("variation_name")
  private String variationName = null;

  @JsonProperty("modifiers")
  private List<OrderLineItemModifier> modifiers = new ArrayList<OrderLineItemModifier>();

  @JsonProperty("taxes")
  private List<OrderLineItemTax> taxes = new ArrayList<OrderLineItemTax>();

  @JsonProperty("discounts")
  private List<OrderLineItemDiscount> discounts = new ArrayList<OrderLineItemDiscount>();

  @JsonProperty("applied_taxes")
  private List<OrderLineItemAppliedTax> appliedTaxes = new ArrayList<OrderLineItemAppliedTax>();

  @JsonProperty("applied_discounts")
  private List<OrderLineItemAppliedDiscount> appliedDiscounts = new ArrayList<OrderLineItemAppliedDiscount>();

  @JsonProperty("base_price_money")
  private Money basePriceMoney = null;

  @JsonProperty("variation_total_price_money")
  private Money variationTotalPriceMoney = null;

  @JsonProperty("gross_sales_money")
  private Money grossSalesMoney = null;

  @JsonProperty("total_tax_money")
  private Money totalTaxMoney = null;

  @JsonProperty("total_discount_money")
  private Money totalDiscountMoney = null;

  @JsonProperty("total_money")
  private Money totalMoney = null;

  public OrderLineItem uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Unique ID that identifies the line item only within this order.
   * @return uid
  **/
  @ApiModelProperty(value = "Unique ID that identifies the line item only within this order.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public OrderLineItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the line item.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the line item.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderLineItem quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity purchased, formatted as a decimal number. For example: `\"3\"`.  Line items with a `quantity_unit` can have non-integer quantities. For example: `\"1.70000\"`.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The quantity purchased, formatted as a decimal number. For example: `\"3\"`.  Line items with a `quantity_unit` can have non-integer quantities. For example: `\"1.70000\"`.")
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public OrderLineItem quantityUnit(OrderQuantityUnit quantityUnit) {
    this.quantityUnit = quantityUnit;
    return this;
  }

   /**
   * The unit and precision that this line item's quantity is measured in.
   * @return quantityUnit
  **/
  @ApiModelProperty(value = "The unit and precision that this line item's quantity is measured in.")
  public OrderQuantityUnit getQuantityUnit() {
    return quantityUnit;
  }

  public void setQuantityUnit(OrderQuantityUnit quantityUnit) {
    this.quantityUnit = quantityUnit;
  }

  public OrderLineItem note(String note) {
    this.note = note;
    return this;
  }

   /**
   * The note of the line item.
   * @return note
  **/
  @ApiModelProperty(value = "The note of the line item.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public OrderLineItem catalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
    return this;
  }

   /**
   * The [CatalogItemVariation](#type-catalogitemvariation) id applied to this line item.
   * @return catalogObjectId
  **/
  @ApiModelProperty(value = "The [CatalogItemVariation](#type-catalogitemvariation) id applied to this line item.")
  public String getCatalogObjectId() {
    return catalogObjectId;
  }

  public void setCatalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
  }

  public OrderLineItem variationName(String variationName) {
    this.variationName = variationName;
    return this;
  }

   /**
   * The name of the variation applied to this line item.
   * @return variationName
  **/
  @ApiModelProperty(value = "The name of the variation applied to this line item.")
  public String getVariationName() {
    return variationName;
  }

  public void setVariationName(String variationName) {
    this.variationName = variationName;
  }

  public OrderLineItem modifiers(List<OrderLineItemModifier> modifiers) {
    this.modifiers = modifiers;
    return this;
  }

  public OrderLineItem addModifiersItem(OrderLineItemModifier modifiersItem) {
    this.modifiers.add(modifiersItem);
    return this;
  }

   /**
   * The [CatalogModifier](#type-catalogmodifier)s applied to this line item.
   * @return modifiers
  **/
  @ApiModelProperty(value = "The [CatalogModifier](#type-catalogmodifier)s applied to this line item.")
  public List<OrderLineItemModifier> getModifiers() {
    return modifiers;
  }

  public void setModifiers(List<OrderLineItemModifier> modifiers) {
    this.modifiers = modifiers;
  }

  public OrderLineItem taxes(List<OrderLineItemTax> taxes) {
    this.taxes = taxes;
    return this;
  }

  public OrderLineItem addTaxesItem(OrderLineItemTax taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * A list of taxes applied to this line item. On read or retrieve, this list includes both item-level taxes and any order-level taxes apportioned to this item. When creating an Order, set your item-level taxes in this list.  This field has been deprecated in favour of `applied_taxes`. Usage of both this field and `applied_taxes` when creating an order will result in an error. Usage of this field when sending requests to the UpdateOrder endpoint will result in an error.
   * @return taxes
  **/
  @ApiModelProperty(value = "A list of taxes applied to this line item. On read or retrieve, this list includes both item-level taxes and any order-level taxes apportioned to this item. When creating an Order, set your item-level taxes in this list.  This field has been deprecated in favour of `applied_taxes`. Usage of both this field and `applied_taxes` when creating an order will result in an error. Usage of this field when sending requests to the UpdateOrder endpoint will result in an error.")
  public List<OrderLineItemTax> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<OrderLineItemTax> taxes) {
    this.taxes = taxes;
  }

  public OrderLineItem discounts(List<OrderLineItemDiscount> discounts) {
    this.discounts = discounts;
    return this;
  }

  public OrderLineItem addDiscountsItem(OrderLineItemDiscount discountsItem) {
    this.discounts.add(discountsItem);
    return this;
  }

   /**
   * A list of discounts applied to this line item. On read or retrieve, this list includes both item-level discounts and any order-level discounts apportioned to this item. When creating an Order, set your item-level discounts in this list.  This field has been deprecated in favour of `applied_discounts`. Usage of both this field and `applied_discounts` when creating an order will result in an error. Usage of this field when sending requests to the UpdateOrder endpoint will result in an error.
   * @return discounts
  **/
  @ApiModelProperty(value = "A list of discounts applied to this line item. On read or retrieve, this list includes both item-level discounts and any order-level discounts apportioned to this item. When creating an Order, set your item-level discounts in this list.  This field has been deprecated in favour of `applied_discounts`. Usage of both this field and `applied_discounts` when creating an order will result in an error. Usage of this field when sending requests to the UpdateOrder endpoint will result in an error.")
  public List<OrderLineItemDiscount> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<OrderLineItemDiscount> discounts) {
    this.discounts = discounts;
  }

  public OrderLineItem appliedTaxes(List<OrderLineItemAppliedTax> appliedTaxes) {
    this.appliedTaxes = appliedTaxes;
    return this;
  }

  public OrderLineItem addAppliedTaxesItem(OrderLineItemAppliedTax appliedTaxesItem) {
    this.appliedTaxes.add(appliedTaxesItem);
    return this;
  }

   /**
   * The list of references to taxes applied to this line item. Each `OrderLineItemAppliedTax` has a `tax_uid` that references the `uid` of a top-level `OrderLineItemTax` applied to the line item. On reads, the amount applied is populated.  An `OrderLineItemAppliedTax` will be automatically created on every line item for all `ORDER` scoped taxes added to the order. `OrderLineItemAppliedTax` records for `LINE_ITEM` scoped taxes must be added in requests for the tax to apply to any line items.  To change the amount of a tax, modify the referenced top-level tax.
   * @return appliedTaxes
  **/
  @ApiModelProperty(value = "The list of references to taxes applied to this line item. Each `OrderLineItemAppliedTax` has a `tax_uid` that references the `uid` of a top-level `OrderLineItemTax` applied to the line item. On reads, the amount applied is populated.  An `OrderLineItemAppliedTax` will be automatically created on every line item for all `ORDER` scoped taxes added to the order. `OrderLineItemAppliedTax` records for `LINE_ITEM` scoped taxes must be added in requests for the tax to apply to any line items.  To change the amount of a tax, modify the referenced top-level tax.")
  public List<OrderLineItemAppliedTax> getAppliedTaxes() {
    return appliedTaxes;
  }

  public void setAppliedTaxes(List<OrderLineItemAppliedTax> appliedTaxes) {
    this.appliedTaxes = appliedTaxes;
  }

  public OrderLineItem appliedDiscounts(List<OrderLineItemAppliedDiscount> appliedDiscounts) {
    this.appliedDiscounts = appliedDiscounts;
    return this;
  }

  public OrderLineItem addAppliedDiscountsItem(OrderLineItemAppliedDiscount appliedDiscountsItem) {
    this.appliedDiscounts.add(appliedDiscountsItem);
    return this;
  }

   /**
   * The list of references to discounts applied to this line item. Each `OrderLineItemAppliedDiscount` has a `discount_uid` that references the `uid` of a top-level `OrderLineItemDiscounts` applied to the line item. On reads, the amount applied is populated.  An `OrderLineItemAppliedDiscount` will be automatically created on every line item for all `ORDER` scoped discounts that are added to the order. `OrderLineItemAppliedDiscount` records for `LINE_ITEM` scoped discounts must be added in requests for the discount to apply to any line items.  To change the amount of a discount, modify the referenced top-level discount.
   * @return appliedDiscounts
  **/
  @ApiModelProperty(value = "The list of references to discounts applied to this line item. Each `OrderLineItemAppliedDiscount` has a `discount_uid` that references the `uid` of a top-level `OrderLineItemDiscounts` applied to the line item. On reads, the amount applied is populated.  An `OrderLineItemAppliedDiscount` will be automatically created on every line item for all `ORDER` scoped discounts that are added to the order. `OrderLineItemAppliedDiscount` records for `LINE_ITEM` scoped discounts must be added in requests for the discount to apply to any line items.  To change the amount of a discount, modify the referenced top-level discount.")
  public List<OrderLineItemAppliedDiscount> getAppliedDiscounts() {
    return appliedDiscounts;
  }

  public void setAppliedDiscounts(List<OrderLineItemAppliedDiscount> appliedDiscounts) {
    this.appliedDiscounts = appliedDiscounts;
  }

  public OrderLineItem basePriceMoney(Money basePriceMoney) {
    this.basePriceMoney = basePriceMoney;
    return this;
  }

   /**
   * The base price for a single unit of the line item.
   * @return basePriceMoney
  **/
  @ApiModelProperty(value = "The base price for a single unit of the line item.")
  public Money getBasePriceMoney() {
    return basePriceMoney;
  }

  public void setBasePriceMoney(Money basePriceMoney) {
    this.basePriceMoney = basePriceMoney;
  }

  public OrderLineItem variationTotalPriceMoney(Money variationTotalPriceMoney) {
    this.variationTotalPriceMoney = variationTotalPriceMoney;
    return this;
  }

   /**
   * The total price of all item variations sold in this line item. Calculated as `base_price_money` multiplied by `quantity`. Does not include modifiers.
   * @return variationTotalPriceMoney
  **/
  @ApiModelProperty(value = "The total price of all item variations sold in this line item. Calculated as `base_price_money` multiplied by `quantity`. Does not include modifiers.")
  public Money getVariationTotalPriceMoney() {
    return variationTotalPriceMoney;
  }

  public void setVariationTotalPriceMoney(Money variationTotalPriceMoney) {
    this.variationTotalPriceMoney = variationTotalPriceMoney;
  }

  public OrderLineItem grossSalesMoney(Money grossSalesMoney) {
    this.grossSalesMoney = grossSalesMoney;
    return this;
  }

   /**
   * The amount of money made in gross sales for this line item. Calculated as the sum of the variation's total price and each modifier's total price.
   * @return grossSalesMoney
  **/
  @ApiModelProperty(value = "The amount of money made in gross sales for this line item. Calculated as the sum of the variation's total price and each modifier's total price.")
  public Money getGrossSalesMoney() {
    return grossSalesMoney;
  }

  public void setGrossSalesMoney(Money grossSalesMoney) {
    this.grossSalesMoney = grossSalesMoney;
  }

  public OrderLineItem totalTaxMoney(Money totalTaxMoney) {
    this.totalTaxMoney = totalTaxMoney;
    return this;
  }

   /**
   * The total tax amount of money to collect for the line item.
   * @return totalTaxMoney
  **/
  @ApiModelProperty(value = "The total tax amount of money to collect for the line item.")
  public Money getTotalTaxMoney() {
    return totalTaxMoney;
  }

  public void setTotalTaxMoney(Money totalTaxMoney) {
    this.totalTaxMoney = totalTaxMoney;
  }

  public OrderLineItem totalDiscountMoney(Money totalDiscountMoney) {
    this.totalDiscountMoney = totalDiscountMoney;
    return this;
  }

   /**
   * The total discount amount of money to collect for the line item.
   * @return totalDiscountMoney
  **/
  @ApiModelProperty(value = "The total discount amount of money to collect for the line item.")
  public Money getTotalDiscountMoney() {
    return totalDiscountMoney;
  }

  public void setTotalDiscountMoney(Money totalDiscountMoney) {
    this.totalDiscountMoney = totalDiscountMoney;
  }

  public OrderLineItem totalMoney(Money totalMoney) {
    this.totalMoney = totalMoney;
    return this;
  }

   /**
   * The total amount of money to collect for this line item.
   * @return totalMoney
  **/
  @ApiModelProperty(value = "The total amount of money to collect for this line item.")
  public Money getTotalMoney() {
    return totalMoney;
  }

  public void setTotalMoney(Money totalMoney) {
    this.totalMoney = totalMoney;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLineItem orderLineItem = (OrderLineItem) o;
    return Objects.equals(this.uid, orderLineItem.uid) &&
        Objects.equals(this.name, orderLineItem.name) &&
        Objects.equals(this.quantity, orderLineItem.quantity) &&
        Objects.equals(this.quantityUnit, orderLineItem.quantityUnit) &&
        Objects.equals(this.note, orderLineItem.note) &&
        Objects.equals(this.catalogObjectId, orderLineItem.catalogObjectId) &&
        Objects.equals(this.variationName, orderLineItem.variationName) &&
        Objects.equals(this.modifiers, orderLineItem.modifiers) &&
        Objects.equals(this.taxes, orderLineItem.taxes) &&
        Objects.equals(this.discounts, orderLineItem.discounts) &&
        Objects.equals(this.appliedTaxes, orderLineItem.appliedTaxes) &&
        Objects.equals(this.appliedDiscounts, orderLineItem.appliedDiscounts) &&
        Objects.equals(this.basePriceMoney, orderLineItem.basePriceMoney) &&
        Objects.equals(this.variationTotalPriceMoney, orderLineItem.variationTotalPriceMoney) &&
        Objects.equals(this.grossSalesMoney, orderLineItem.grossSalesMoney) &&
        Objects.equals(this.totalTaxMoney, orderLineItem.totalTaxMoney) &&
        Objects.equals(this.totalDiscountMoney, orderLineItem.totalDiscountMoney) &&
        Objects.equals(this.totalMoney, orderLineItem.totalMoney);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, name, quantity, quantityUnit, note, catalogObjectId, variationName, modifiers, taxes, discounts, appliedTaxes, appliedDiscounts, basePriceMoney, variationTotalPriceMoney, grossSalesMoney, totalTaxMoney, totalDiscountMoney, totalMoney);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineItem {\n");

    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityUnit: ").append(toIndentedString(quantityUnit)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    catalogObjectId: ").append(toIndentedString(catalogObjectId)).append("\n");
    sb.append("    variationName: ").append(toIndentedString(variationName)).append("\n");
    sb.append("    modifiers: ").append(toIndentedString(modifiers)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    appliedTaxes: ").append(toIndentedString(appliedTaxes)).append("\n");
    sb.append("    appliedDiscounts: ").append(toIndentedString(appliedDiscounts)).append("\n");
    sb.append("    basePriceMoney: ").append(toIndentedString(basePriceMoney)).append("\n");
    sb.append("    variationTotalPriceMoney: ").append(toIndentedString(variationTotalPriceMoney)).append("\n");
    sb.append("    grossSalesMoney: ").append(toIndentedString(grossSalesMoney)).append("\n");
    sb.append("    totalTaxMoney: ").append(toIndentedString(totalTaxMoney)).append("\n");
    sb.append("    totalDiscountMoney: ").append(toIndentedString(totalDiscountMoney)).append("\n");
    sb.append("    totalMoney: ").append(toIndentedString(totalMoney)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
