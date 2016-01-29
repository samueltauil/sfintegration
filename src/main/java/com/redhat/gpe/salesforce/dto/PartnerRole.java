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
 * Salesforce DTO for SObject PartnerRole
 */
@XStreamAlias("PartnerRole")
public class PartnerRole extends AbstractSObjectBase {

    // MasterLabel
    private String MasterLabel;

    @JsonProperty("MasterLabel")
    public String getMasterLabel() {
        return this.MasterLabel;
    }

    @JsonProperty("MasterLabel")
    public void setMasterLabel(String MasterLabel) {
        this.MasterLabel = MasterLabel;
    }

    // SortOrder
    private Integer SortOrder;

    @JsonProperty("SortOrder")
    public Integer getSortOrder() {
        return this.SortOrder;
    }

    @JsonProperty("SortOrder")
    public void setSortOrder(Integer SortOrder) {
        this.SortOrder = SortOrder;
    }

    // ReverseRole
    @XStreamConverter(PicklistEnumConverter.class)
    private ReverseRoleEnum ReverseRole;

    @JsonProperty("ReverseRole")
    public ReverseRoleEnum getReverseRole() {
        return this.ReverseRole;
    }

    @JsonProperty("ReverseRole")
    public void setReverseRole(ReverseRoleEnum ReverseRole) {
        this.ReverseRole = ReverseRole;
    }

}
