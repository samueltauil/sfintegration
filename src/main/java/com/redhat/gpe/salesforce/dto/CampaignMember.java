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
 * Salesforce DTO for SObject CampaignMember
 */
@XStreamAlias("CampaignMember")
public class CampaignMember extends AbstractSObjectBase {

    // CampaignId
    private String CampaignId;

    @JsonProperty("CampaignId")
    public String getCampaignId() {
        return this.CampaignId;
    }

    @JsonProperty("CampaignId")
    public void setCampaignId(String CampaignId) {
        this.CampaignId = CampaignId;
    }

    // LeadId
    private String LeadId;

    @JsonProperty("LeadId")
    public String getLeadId() {
        return this.LeadId;
    }

    @JsonProperty("LeadId")
    public void setLeadId(String LeadId) {
        this.LeadId = LeadId;
    }

    // ContactId
    private String ContactId;

    @JsonProperty("ContactId")
    public String getContactId() {
        return this.ContactId;
    }

    @JsonProperty("ContactId")
    public void setContactId(String ContactId) {
        this.ContactId = ContactId;
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

    // HasResponded
    private Boolean HasResponded;

    @JsonProperty("HasResponded")
    public Boolean getHasResponded() {
        return this.HasResponded;
    }

    @JsonProperty("HasResponded")
    public void setHasResponded(Boolean HasResponded) {
        this.HasResponded = HasResponded;
    }

    // FirstRespondedDate
    private org.joda.time.DateTime FirstRespondedDate;

    @JsonProperty("FirstRespondedDate")
    public org.joda.time.DateTime getFirstRespondedDate() {
        return this.FirstRespondedDate;
    }

    @JsonProperty("FirstRespondedDate")
    public void setFirstRespondedDate(org.joda.time.DateTime FirstRespondedDate) {
        this.FirstRespondedDate = FirstRespondedDate;
    }

}
