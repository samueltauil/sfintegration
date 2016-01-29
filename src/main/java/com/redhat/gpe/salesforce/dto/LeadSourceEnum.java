/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist LeadSource
 */
public enum LeadSourceEnum {

    // Other
    OTHER("Other"),
    // Partner Referral
    PARTNER_REFERRAL("Partner Referral"),
    // Phone Inquiry
    PHONE_INQUIRY("Phone Inquiry"),
    // Purchased List
    PURCHASED_LIST("Purchased List"),
    // Web
    WEB("Web");

    final String value;

    private LeadSourceEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LeadSourceEnum fromValue(String value) {
        for (LeadSourceEnum e : LeadSourceEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
