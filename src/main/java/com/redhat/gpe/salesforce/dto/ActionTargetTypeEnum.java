/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ActionTargetType
 */
public enum ActionTargetTypeEnum {

    // Describe
    DESCRIBE("Describe"),
    // Invoke
    INVOKE("Invoke"),
    // Visualforce
    VISUALFORCE("Visualforce");

    final String value;

    private ActionTargetTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ActionTargetTypeEnum fromValue(String value) {
        for (ActionTargetTypeEnum e : ActionTargetTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
