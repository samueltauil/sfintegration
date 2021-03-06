/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist YearType
 */
public enum YearTypeEnum {

    // Custom
    CUSTOM("Custom"),
    // Placeholder
    PLACEHOLDER("Placeholder"),
    // Standard
    STANDARD("Standard");

    final String value;

    private YearTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static YearTypeEnum fromValue(String value) {
        for (YearTypeEnum e : YearTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
