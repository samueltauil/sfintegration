/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist LinkState
 */
public enum LinkStateEnum {

    // Duplicate
    DUPLICATE("Duplicate"),
    // Ignored
    IGNORED("Ignored"),
    // Linked
    LINKED("Linked"),
    // Orphaned
    ORPHANED("Orphaned");

    final String value;

    private LinkStateEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LinkStateEnum fromValue(String value) {
        for (LinkStateEnum e : LinkStateEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
