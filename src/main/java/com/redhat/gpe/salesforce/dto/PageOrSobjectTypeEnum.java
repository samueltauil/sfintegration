/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist PageOrSobjectType
 */
public enum PageOrSobjectTypeEnum {

    // Account
    ACCOUNT("Account"),
    // Activity
    ACTIVITY("Activity"),
    // Asset
    ASSET("Asset"),
    // Campaign
    CAMPAIGN("Campaign"),
    // CampaignMember
    CAMPAIGNMEMBER("CampaignMember"),
    // Case
    CASE("Case"),
    // Contact
    CONTACT("Contact"),
    // ContentVersion
    CONTENTVERSION("ContentVersion"),
    // Contract
    CONTRACT("Contract"),
    // CustomPageItem
    CUSTOMPAGEITEM("CustomPageItem"),
    // DandBCompany
    DANDBCOMPANY("DandBCompany"),
    // DashboardComponent
    DASHBOARDCOMPONENT("DashboardComponent"),
    // DuplicateRecordItem
    DUPLICATERECORDITEM("DuplicateRecordItem"),
    // DuplicateRecordSet
    DUPLICATERECORDSET("DuplicateRecordSet"),
    // Event
    EVENT("Event"),
    // Goal
    GOAL("Goal"),
    // GoalLink
    GOALLINK("GoalLink"),
    // Idea
    IDEA("Idea"),
    // Lead
    LEAD("Lead"),
    // Macro
    MACRO("Macro"),
    // Metric
    METRIC("Metric"),
    // Opportunity
    OPPORTUNITY("Opportunity"),
    // OpportunityLineItem
    OPPORTUNITYLINEITEM("OpportunityLineItem"),
    // Order
    ORDER("Order"),
    // OrderItem
    ORDERITEM("OrderItem"),
    // Product2
    PRODUCT2("Product2"),
    // Solution
    SOLUTION("Solution"),
    // Task
    TASK("Task"),
    // User
    USER("User"),
    // UserProvisioningRequest
    USERPROVISIONINGREQUEST("UserProvisioningRequest"),
    // WorkCoaching
    WORKCOACHING("WorkCoaching"),
    // WorkFeedback
    WORKFEEDBACK("WorkFeedback"),
    // WorkFeedbackQuestion
    WORKFEEDBACKQUESTION("WorkFeedbackQuestion"),
    // WorkFeedbackQuestionSet
    WORKFEEDBACKQUESTIONSET("WorkFeedbackQuestionSet"),
    // WorkFeedbackRequest
    WORKFEEDBACKREQUEST("WorkFeedbackRequest"),
    // WorkFeedbackTemplate
    WORKFEEDBACKTEMPLATE("WorkFeedbackTemplate"),
    // WorkPerformanceCycle
    WORKPERFORMANCECYCLE("WorkPerformanceCycle");

    final String value;

    private PageOrSobjectTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static PageOrSobjectTypeEnum fromValue(String value) {
        for (PageOrSobjectTypeEnum e : PageOrSobjectTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
