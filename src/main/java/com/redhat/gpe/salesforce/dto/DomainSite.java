/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject DomainSite
 */
@XStreamAlias("DomainSite")
public class DomainSite extends AbstractSObjectBase {

    // DomainId
    private String DomainId;

    @JsonProperty("DomainId")
    public String getDomainId() {
        return this.DomainId;
    }

    @JsonProperty("DomainId")
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    // SiteId
    private String SiteId;

    @JsonProperty("SiteId")
    public String getSiteId() {
        return this.SiteId;
    }

    @JsonProperty("SiteId")
    public void setSiteId(String SiteId) {
        this.SiteId = SiteId;
    }

    // PathPrefix
    private String PathPrefix;

    @JsonProperty("PathPrefix")
    public String getPathPrefix() {
        return this.PathPrefix;
    }

    @JsonProperty("PathPrefix")
    public void setPathPrefix(String PathPrefix) {
        this.PathPrefix = PathPrefix;
    }

}