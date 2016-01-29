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
 * Salesforce DTO for SObject TenantSecret
 */
@XStreamAlias("TenantSecret")
public class TenantSecret extends AbstractSObjectBase {

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

    // SecretValue
    // blob field url, use getBlobField to get the content
    @XStreamAlias("SecretValue")
    private String SecretValueUrl;

    @JsonProperty("SecretValue")
    public String getSecretValueUrl() {
        return this.SecretValueUrl;
    }

    @JsonProperty("SecretValue")
    public void setSecretValueUrl(String SecretValueUrl) {
        this.SecretValueUrl = SecretValueUrl;
    }

    // Version
    private Integer Version;

    @JsonProperty("Version")
    public Integer getVersion() {
        return this.Version;
    }

    @JsonProperty("Version")
    public void setVersion(Integer Version) {
        this.Version = Version;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private StatusEnum Status;

    @JsonProperty("Status")
    public StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(StatusEnum Status) {
        this.Status = Status;
    }

}