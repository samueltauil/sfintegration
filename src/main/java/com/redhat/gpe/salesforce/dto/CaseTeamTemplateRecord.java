/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject CaseTeamTemplateRecord
 */
@XStreamAlias("CaseTeamTemplateRecord")
public class CaseTeamTemplateRecord extends AbstractSObjectBase {

    // ParentId
    private String ParentId;

    @JsonProperty("ParentId")
    public String getParentId() {
        return this.ParentId;
    }

    @JsonProperty("ParentId")
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    // TeamTemplateId
    private String TeamTemplateId;

    @JsonProperty("TeamTemplateId")
    public String getTeamTemplateId() {
        return this.TeamTemplateId;
    }

    @JsonProperty("TeamTemplateId")
    public void setTeamTemplateId(String TeamTemplateId) {
        this.TeamTemplateId = TeamTemplateId;
    }

}
