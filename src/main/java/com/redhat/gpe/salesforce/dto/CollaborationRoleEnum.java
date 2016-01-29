/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CollaborationRole
 */
public enum CollaborationRoleEnum {

    // Admin
    ADMIN("Admin"),
    // Standard
    STANDARD("Standard");

    final String value;

    private CollaborationRoleEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CollaborationRoleEnum fromValue(String value) {
        for (CollaborationRoleEnum e : CollaborationRoleEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
