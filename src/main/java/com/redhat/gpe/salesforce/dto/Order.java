/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject Order
 */
@XStreamAlias("Order")
public class Order extends AbstractSObjectBase {

    // ContractId
    private String ContractId;

    @JsonProperty("ContractId")
    public String getContractId() {
        return this.ContractId;
    }

    @JsonProperty("ContractId")
    public void setContractId(String ContractId) {
        this.ContractId = ContractId;
    }

    // AccountId
    private String AccountId;

    @JsonProperty("AccountId")
    public String getAccountId() {
        return this.AccountId;
    }

    @JsonProperty("AccountId")
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    // Pricebook2Id
    private String Pricebook2Id;

    @JsonProperty("Pricebook2Id")
    public String getPricebook2Id() {
        return this.Pricebook2Id;
    }

    @JsonProperty("Pricebook2Id")
    public void setPricebook2Id(String Pricebook2Id) {
        this.Pricebook2Id = Pricebook2Id;
    }

    // OriginalOrderId
    private String OriginalOrderId;

    @JsonProperty("OriginalOrderId")
    public String getOriginalOrderId() {
        return this.OriginalOrderId;
    }

    @JsonProperty("OriginalOrderId")
    public void setOriginalOrderId(String OriginalOrderId) {
        this.OriginalOrderId = OriginalOrderId;
    }

    // EffectiveDate
    private org.joda.time.DateTime EffectiveDate;

    @JsonProperty("EffectiveDate")
    public org.joda.time.DateTime getEffectiveDate() {
        return this.EffectiveDate;
    }

    @JsonProperty("EffectiveDate")
    public void setEffectiveDate(org.joda.time.DateTime EffectiveDate) {
        this.EffectiveDate = EffectiveDate;
    }

    // EndDate
    private org.joda.time.DateTime EndDate;

    @JsonProperty("EndDate")
    public org.joda.time.DateTime getEndDate() {
        return this.EndDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(org.joda.time.DateTime EndDate) {
        this.EndDate = EndDate;
    }

    // IsReductionOrder
    private Boolean IsReductionOrder;

    @JsonProperty("IsReductionOrder")
    public Boolean getIsReductionOrder() {
        return this.IsReductionOrder;
    }

    @JsonProperty("IsReductionOrder")
    public void setIsReductionOrder(Boolean IsReductionOrder) {
        this.IsReductionOrder = IsReductionOrder;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private StatusEnum Status;

    @JsonProperty("Status")
    public StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(StatusEnum Status) {
        this.Status = Status;
    }

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // CustomerAuthorizedById
    private String CustomerAuthorizedById;

    @JsonProperty("CustomerAuthorizedById")
    public String getCustomerAuthorizedById() {
        return this.CustomerAuthorizedById;
    }

    @JsonProperty("CustomerAuthorizedById")
    public void setCustomerAuthorizedById(String CustomerAuthorizedById) {
        this.CustomerAuthorizedById = CustomerAuthorizedById;
    }

    // CustomerAuthorizedDate
    private org.joda.time.DateTime CustomerAuthorizedDate;

    @JsonProperty("CustomerAuthorizedDate")
    public org.joda.time.DateTime getCustomerAuthorizedDate() {
        return this.CustomerAuthorizedDate;
    }

    @JsonProperty("CustomerAuthorizedDate")
    public void setCustomerAuthorizedDate(org.joda.time.DateTime CustomerAuthorizedDate) {
        this.CustomerAuthorizedDate = CustomerAuthorizedDate;
    }

    // CompanyAuthorizedById
    private String CompanyAuthorizedById;

    @JsonProperty("CompanyAuthorizedById")
    public String getCompanyAuthorizedById() {
        return this.CompanyAuthorizedById;
    }

    @JsonProperty("CompanyAuthorizedById")
    public void setCompanyAuthorizedById(String CompanyAuthorizedById) {
        this.CompanyAuthorizedById = CompanyAuthorizedById;
    }

    // CompanyAuthorizedDate
    private org.joda.time.DateTime CompanyAuthorizedDate;

    @JsonProperty("CompanyAuthorizedDate")
    public org.joda.time.DateTime getCompanyAuthorizedDate() {
        return this.CompanyAuthorizedDate;
    }

    @JsonProperty("CompanyAuthorizedDate")
    public void setCompanyAuthorizedDate(org.joda.time.DateTime CompanyAuthorizedDate) {
        this.CompanyAuthorizedDate = CompanyAuthorizedDate;
    }

    // Type
    @XStreamConverter(PicklistEnumConverter.class)
    private TypeEnum Type;

    @JsonProperty("Type")
    public TypeEnum getType() {
        return this.Type;
    }

    @JsonProperty("Type")
    public void setType(TypeEnum Type) {
        this.Type = Type;
    }

    // BillingStreet
    private String BillingStreet;

    @JsonProperty("BillingStreet")
    public String getBillingStreet() {
        return this.BillingStreet;
    }

    @JsonProperty("BillingStreet")
    public void setBillingStreet(String BillingStreet) {
        this.BillingStreet = BillingStreet;
    }

    // BillingCity
    private String BillingCity;

    @JsonProperty("BillingCity")
    public String getBillingCity() {
        return this.BillingCity;
    }

    @JsonProperty("BillingCity")
    public void setBillingCity(String BillingCity) {
        this.BillingCity = BillingCity;
    }

    // BillingState
    private String BillingState;

    @JsonProperty("BillingState")
    public String getBillingState() {
        return this.BillingState;
    }

    @JsonProperty("BillingState")
    public void setBillingState(String BillingState) {
        this.BillingState = BillingState;
    }

    // BillingPostalCode
    private String BillingPostalCode;

    @JsonProperty("BillingPostalCode")
    public String getBillingPostalCode() {
        return this.BillingPostalCode;
    }

    @JsonProperty("BillingPostalCode")
    public void setBillingPostalCode(String BillingPostalCode) {
        this.BillingPostalCode = BillingPostalCode;
    }

    // BillingCountry
    private String BillingCountry;

    @JsonProperty("BillingCountry")
    public String getBillingCountry() {
        return this.BillingCountry;
    }

    @JsonProperty("BillingCountry")
    public void setBillingCountry(String BillingCountry) {
        this.BillingCountry = BillingCountry;
    }

    // BillingLatitude
    private Double BillingLatitude;

    @JsonProperty("BillingLatitude")
    public Double getBillingLatitude() {
        return this.BillingLatitude;
    }

    @JsonProperty("BillingLatitude")
    public void setBillingLatitude(Double BillingLatitude) {
        this.BillingLatitude = BillingLatitude;
    }

    // BillingLongitude
    private Double BillingLongitude;

    @JsonProperty("BillingLongitude")
    public Double getBillingLongitude() {
        return this.BillingLongitude;
    }

    @JsonProperty("BillingLongitude")
    public void setBillingLongitude(Double BillingLongitude) {
        this.BillingLongitude = BillingLongitude;
    }

    // BillingAddress
    private org.apache.camel.component.salesforce.api.dto.Address BillingAddress;

    @JsonProperty("BillingAddress")
    public org.apache.camel.component.salesforce.api.dto.Address getBillingAddress() {
        return this.BillingAddress;
    }

    @JsonProperty("BillingAddress")
    public void setBillingAddress(org.apache.camel.component.salesforce.api.dto.Address BillingAddress) {
        this.BillingAddress = BillingAddress;
    }

    // ShippingStreet
    private String ShippingStreet;

    @JsonProperty("ShippingStreet")
    public String getShippingStreet() {
        return this.ShippingStreet;
    }

    @JsonProperty("ShippingStreet")
    public void setShippingStreet(String ShippingStreet) {
        this.ShippingStreet = ShippingStreet;
    }

    // ShippingCity
    private String ShippingCity;

    @JsonProperty("ShippingCity")
    public String getShippingCity() {
        return this.ShippingCity;
    }

    @JsonProperty("ShippingCity")
    public void setShippingCity(String ShippingCity) {
        this.ShippingCity = ShippingCity;
    }

    // ShippingState
    private String ShippingState;

    @JsonProperty("ShippingState")
    public String getShippingState() {
        return this.ShippingState;
    }

    @JsonProperty("ShippingState")
    public void setShippingState(String ShippingState) {
        this.ShippingState = ShippingState;
    }

    // ShippingPostalCode
    private String ShippingPostalCode;

    @JsonProperty("ShippingPostalCode")
    public String getShippingPostalCode() {
        return this.ShippingPostalCode;
    }

    @JsonProperty("ShippingPostalCode")
    public void setShippingPostalCode(String ShippingPostalCode) {
        this.ShippingPostalCode = ShippingPostalCode;
    }

    // ShippingCountry
    private String ShippingCountry;

    @JsonProperty("ShippingCountry")
    public String getShippingCountry() {
        return this.ShippingCountry;
    }

    @JsonProperty("ShippingCountry")
    public void setShippingCountry(String ShippingCountry) {
        this.ShippingCountry = ShippingCountry;
    }

    // ShippingLatitude
    private Double ShippingLatitude;

    @JsonProperty("ShippingLatitude")
    public Double getShippingLatitude() {
        return this.ShippingLatitude;
    }

    @JsonProperty("ShippingLatitude")
    public void setShippingLatitude(Double ShippingLatitude) {
        this.ShippingLatitude = ShippingLatitude;
    }

    // ShippingLongitude
    private Double ShippingLongitude;

    @JsonProperty("ShippingLongitude")
    public Double getShippingLongitude() {
        return this.ShippingLongitude;
    }

    @JsonProperty("ShippingLongitude")
    public void setShippingLongitude(Double ShippingLongitude) {
        this.ShippingLongitude = ShippingLongitude;
    }

    // ShippingAddress
    private org.apache.camel.component.salesforce.api.dto.Address ShippingAddress;

    @JsonProperty("ShippingAddress")
    public org.apache.camel.component.salesforce.api.dto.Address getShippingAddress() {
        return this.ShippingAddress;
    }

    @JsonProperty("ShippingAddress")
    public void setShippingAddress(org.apache.camel.component.salesforce.api.dto.Address ShippingAddress) {
        this.ShippingAddress = ShippingAddress;
    }

    // PoDate
    private org.joda.time.DateTime PoDate;

    @JsonProperty("PoDate")
    public org.joda.time.DateTime getPoDate() {
        return this.PoDate;
    }

    @JsonProperty("PoDate")
    public void setPoDate(org.joda.time.DateTime PoDate) {
        this.PoDate = PoDate;
    }

    // PoNumber
    private String PoNumber;

    @JsonProperty("PoNumber")
    public String getPoNumber() {
        return this.PoNumber;
    }

    @JsonProperty("PoNumber")
    public void setPoNumber(String PoNumber) {
        this.PoNumber = PoNumber;
    }

    // OrderReferenceNumber
    private String OrderReferenceNumber;

    @JsonProperty("OrderReferenceNumber")
    public String getOrderReferenceNumber() {
        return this.OrderReferenceNumber;
    }

    @JsonProperty("OrderReferenceNumber")
    public void setOrderReferenceNumber(String OrderReferenceNumber) {
        this.OrderReferenceNumber = OrderReferenceNumber;
    }

    // BillToContactId
    private String BillToContactId;

    @JsonProperty("BillToContactId")
    public String getBillToContactId() {
        return this.BillToContactId;
    }

    @JsonProperty("BillToContactId")
    public void setBillToContactId(String BillToContactId) {
        this.BillToContactId = BillToContactId;
    }

    // ShipToContactId
    private String ShipToContactId;

    @JsonProperty("ShipToContactId")
    public String getShipToContactId() {
        return this.ShipToContactId;
    }

    @JsonProperty("ShipToContactId")
    public void setShipToContactId(String ShipToContactId) {
        this.ShipToContactId = ShipToContactId;
    }

    // ActivatedDate
    private org.joda.time.DateTime ActivatedDate;

    @JsonProperty("ActivatedDate")
    public org.joda.time.DateTime getActivatedDate() {
        return this.ActivatedDate;
    }

    @JsonProperty("ActivatedDate")
    public void setActivatedDate(org.joda.time.DateTime ActivatedDate) {
        this.ActivatedDate = ActivatedDate;
    }

    // ActivatedById
    private String ActivatedById;

    @JsonProperty("ActivatedById")
    public String getActivatedById() {
        return this.ActivatedById;
    }

    @JsonProperty("ActivatedById")
    public void setActivatedById(String ActivatedById) {
        this.ActivatedById = ActivatedById;
    }

    // StatusCode
    @XStreamConverter(PicklistEnumConverter.class)
    private StatusCodeEnum StatusCode;

    @JsonProperty("StatusCode")
    public StatusCodeEnum getStatusCode() {
        return this.StatusCode;
    }

    @JsonProperty("StatusCode")
    public void setStatusCode(StatusCodeEnum StatusCode) {
        this.StatusCode = StatusCode;
    }

    // OrderNumber
    private String OrderNumber;

    @JsonProperty("OrderNumber")
    public String getOrderNumber() {
        return this.OrderNumber;
    }

    @JsonProperty("OrderNumber")
    public void setOrderNumber(String OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    // TotalAmount
    private Double TotalAmount;

    @JsonProperty("TotalAmount")
    public Double getTotalAmount() {
        return this.TotalAmount;
    }

    @JsonProperty("TotalAmount")
    public void setTotalAmount(Double TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

}
