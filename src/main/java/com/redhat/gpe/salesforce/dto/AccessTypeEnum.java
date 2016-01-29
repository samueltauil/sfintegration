/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist AccessType
 */
public enum AccessTypeEnum {

    // Hidden
    HIDDEN("Hidden"),
    // Public
    PUBLIC("Public"),
    // PublicInternal
    PUBLICINTERNAL("PublicInternal"),
    // Shared
    SHARED("Shared");

    final String value;

    private AccessTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static AccessTypeEnum fromValue(String value) {
        for (AccessTypeEnum e : AccessTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
