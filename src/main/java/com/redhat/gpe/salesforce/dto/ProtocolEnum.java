/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Protocol
 */
public enum ProtocolEnum {

    // NoAuthentication
    NOAUTHENTICATION("NoAuthentication"),
    // Oauth
    OAUTH("Oauth"),
    // Password
    PASSWORD("Password");

    final String value;

    private ProtocolEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ProtocolEnum fromValue(String value) {
        for (ProtocolEnum e : ProtocolEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}