/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ChallengeMethod
 */
public enum ChallengeMethodEnum {

    // Email
    EMAIL("Email"),
    // SMS
    SMS("SMS"),
    // TOTP_CHOICE
    TOTP_CHOICE("TOTP_CHOICE"),
    // TOTP_ONLY
    TOTP_ONLY("TOTP_ONLY");

    final String value;

    private ChallengeMethodEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ChallengeMethodEnum fromValue(String value) {
        for (ChallengeMethodEnum e : ChallengeMethodEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
