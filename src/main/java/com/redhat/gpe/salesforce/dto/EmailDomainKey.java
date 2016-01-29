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
 * Salesforce DTO for SObject EmailDomainKey
 */
@XStreamAlias("EmailDomainKey")
public class EmailDomainKey extends AbstractSObjectBase {

    // Selector
    private String Selector;

    @JsonProperty("Selector")
    public String getSelector() {
        return this.Selector;
    }

    @JsonProperty("Selector")
    public void setSelector(String Selector) {
        this.Selector = Selector;
    }

    // Domain
    private String Domain;

    @JsonProperty("Domain")
    public String getDomain() {
        return this.Domain;
    }

    @JsonProperty("Domain")
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    // DomainMatch
    @XStreamConverter(PicklistEnumConverter.class)
    private DomainMatchEnum DomainMatch;

    @JsonProperty("DomainMatch")
    public DomainMatchEnum getDomainMatch() {
        return this.DomainMatch;
    }

    @JsonProperty("DomainMatch")
    public void setDomainMatch(DomainMatchEnum DomainMatch) {
        this.DomainMatch = DomainMatch;
    }

    // IsActive
    private Boolean IsActive;

    @JsonProperty("IsActive")
    public Boolean getIsActive() {
        return this.IsActive;
    }

    @JsonProperty("IsActive")
    public void setIsActive(Boolean IsActive) {
        this.IsActive = IsActive;
    }

    // PublicKey
    private String PublicKey;

    @JsonProperty("PublicKey")
    public String getPublicKey() {
        return this.PublicKey;
    }

    @JsonProperty("PublicKey")
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    // PrivateKey
    private String PrivateKey;

    @JsonProperty("PrivateKey")
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    @JsonProperty("PrivateKey")
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

}
