/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist NotifyForOperations
 */
public enum NotifyForOperationsEnum {

    // All
    ALL("All"),
    // Create
    CREATE("Create"),
    // Extended
    EXTENDED("Extended"),
    // Update
    UPDATE("Update");

    final String value;

    private NotifyForOperationsEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static NotifyForOperationsEnum fromValue(String value) {
        for (NotifyForOperationsEnum e : NotifyForOperationsEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
