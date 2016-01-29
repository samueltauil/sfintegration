/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject Report
 */
@XStreamAlias("Report")
public class Report extends AbstractSObjectBase {

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // DeveloperName
    private String DeveloperName;

    @JsonProperty("DeveloperName")
    public String getDeveloperName() {
        return this.DeveloperName;
    }

    @JsonProperty("DeveloperName")
    public void setDeveloperName(String DeveloperName) {
        this.DeveloperName = DeveloperName;
    }

    // NamespacePrefix
    private String NamespacePrefix;

    @JsonProperty("NamespacePrefix")
    public String getNamespacePrefix() {
        return this.NamespacePrefix;
    }

    @JsonProperty("NamespacePrefix")
    public void setNamespacePrefix(String NamespacePrefix) {
        this.NamespacePrefix = NamespacePrefix;
    }

    // LastRunDate
    private org.joda.time.DateTime LastRunDate;

    @JsonProperty("LastRunDate")
    public org.joda.time.DateTime getLastRunDate() {
        return this.LastRunDate;
    }

    @JsonProperty("LastRunDate")
    public void setLastRunDate(org.joda.time.DateTime LastRunDate) {
        this.LastRunDate = LastRunDate;
    }

    // Format
    @XStreamConverter(PicklistEnumConverter.class)
    private FormatEnum Format;

    @JsonProperty("Format")
    public FormatEnum getFormat() {
        return this.Format;
    }

    @JsonProperty("Format")
    public void setFormat(FormatEnum Format) {
        this.Format = Format;
    }

}
