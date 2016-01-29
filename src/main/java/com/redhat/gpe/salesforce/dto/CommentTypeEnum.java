/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CommentType
 */
public enum CommentTypeEnum {

    // ContentComment
    CONTENTCOMMENT("ContentComment"),
    // TextComment
    TEXTCOMMENT("TextComment");

    final String value;

    private CommentTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CommentTypeEnum fromValue(String value) {
        for (CommentTypeEnum e : CommentTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}