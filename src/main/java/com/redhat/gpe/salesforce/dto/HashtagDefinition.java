/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject HashtagDefinition
 */
@XStreamAlias("HashtagDefinition")
public class HashtagDefinition extends AbstractSObjectBase {

    // NameNorm
    private String NameNorm;

    @JsonProperty("NameNorm")
    public String getNameNorm() {
        return this.NameNorm;
    }

    @JsonProperty("NameNorm")
    public void setNameNorm(String NameNorm) {
        this.NameNorm = NameNorm;
    }

    // HashtagCount
    private Integer HashtagCount;

    @JsonProperty("HashtagCount")
    public Integer getHashtagCount() {
        return this.HashtagCount;
    }

    @JsonProperty("HashtagCount")
    public void setHashtagCount(Integer HashtagCount) {
        this.HashtagCount = HashtagCount;
    }

}