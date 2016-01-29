/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist TagModel
 */
public enum TagModelEnum {

    // G
    G("G"),
    // R
    R("R"),
    // U
    U("U");

    final String value;

    private TagModelEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static TagModelEnum fromValue(String value) {
        for (TagModelEnum e : TagModelEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
