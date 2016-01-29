/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject CategoryData
 */
@XStreamAlias("CategoryData")
public class CategoryData extends AbstractSObjectBase {

    // CategoryNodeId
    private String CategoryNodeId;

    @JsonProperty("CategoryNodeId")
    public String getCategoryNodeId() {
        return this.CategoryNodeId;
    }

    @JsonProperty("CategoryNodeId")
    public void setCategoryNodeId(String CategoryNodeId) {
        this.CategoryNodeId = CategoryNodeId;
    }

    // RelatedSobjectId
    private String RelatedSobjectId;

    @JsonProperty("RelatedSobjectId")
    public String getRelatedSobjectId() {
        return this.RelatedSobjectId;
    }

    @JsonProperty("RelatedSobjectId")
    public void setRelatedSobjectId(String RelatedSobjectId) {
        this.RelatedSobjectId = RelatedSobjectId;
    }

}
