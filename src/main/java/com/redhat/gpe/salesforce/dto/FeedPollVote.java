/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject FeedPollVote
 */
@XStreamAlias("FeedPollVote")
public class FeedPollVote extends AbstractSObjectBase {

    // FeedItemId
    private String FeedItemId;

    @JsonProperty("FeedItemId")
    public String getFeedItemId() {
        return this.FeedItemId;
    }

    @JsonProperty("FeedItemId")
    public void setFeedItemId(String FeedItemId) {
        this.FeedItemId = FeedItemId;
    }

    // ChoiceId
    private String ChoiceId;

    @JsonProperty("ChoiceId")
    public String getChoiceId() {
        return this.ChoiceId;
    }

    @JsonProperty("ChoiceId")
    public void setChoiceId(String ChoiceId) {
        this.ChoiceId = ChoiceId;
    }

}
