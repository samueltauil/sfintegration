/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist SLAViolation__c
 */
public enum SLAViolationEnum {

    // No
    NO("No"),
    // Yes
    YES("Yes");

    final String value;

    private SLAViolationEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static SLAViolationEnum fromValue(String value) {
        for (SLAViolationEnum e : SLAViolationEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}