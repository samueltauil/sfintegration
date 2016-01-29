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
 * Salesforce DTO for SObject EventLogFile
 */
@XStreamAlias("EventLogFile")
public class EventLogFile extends AbstractSObjectBase {

    // EventType
    @XStreamConverter(PicklistEnumConverter.class)
    private EventTypeEnum EventType;

    @JsonProperty("EventType")
    public EventTypeEnum getEventType() {
        return this.EventType;
    }

    @JsonProperty("EventType")
    public void setEventType(EventTypeEnum EventType) {
        this.EventType = EventType;
    }

    // LogDate
    private org.joda.time.DateTime LogDate;

    @JsonProperty("LogDate")
    public org.joda.time.DateTime getLogDate() {
        return this.LogDate;
    }

    @JsonProperty("LogDate")
    public void setLogDate(org.joda.time.DateTime LogDate) {
        this.LogDate = LogDate;
    }

    // LogFileLength
    private Double LogFileLength;

    @JsonProperty("LogFileLength")
    public Double getLogFileLength() {
        return this.LogFileLength;
    }

    @JsonProperty("LogFileLength")
    public void setLogFileLength(Double LogFileLength) {
        this.LogFileLength = LogFileLength;
    }

    // LogFileContentType
    private String LogFileContentType;

    @JsonProperty("LogFileContentType")
    public String getLogFileContentType() {
        return this.LogFileContentType;
    }

    @JsonProperty("LogFileContentType")
    public void setLogFileContentType(String LogFileContentType) {
        this.LogFileContentType = LogFileContentType;
    }

    // ApiVersion
    private Double ApiVersion;

    @JsonProperty("ApiVersion")
    public Double getApiVersion() {
        return this.ApiVersion;
    }

    @JsonProperty("ApiVersion")
    public void setApiVersion(Double ApiVersion) {
        this.ApiVersion = ApiVersion;
    }

    // LogFileFieldNames
    private String LogFileFieldNames;

    @JsonProperty("LogFileFieldNames")
    public String getLogFileFieldNames() {
        return this.LogFileFieldNames;
    }

    @JsonProperty("LogFileFieldNames")
    public void setLogFileFieldNames(String LogFileFieldNames) {
        this.LogFileFieldNames = LogFileFieldNames;
    }

    // LogFileFieldTypes
    private String LogFileFieldTypes;

    @JsonProperty("LogFileFieldTypes")
    public String getLogFileFieldTypes() {
        return this.LogFileFieldTypes;
    }

    @JsonProperty("LogFileFieldTypes")
    public void setLogFileFieldTypes(String LogFileFieldTypes) {
        this.LogFileFieldTypes = LogFileFieldTypes;
    }

    // LogFile
    // blob field url, use getBlobField to get the content
    @XStreamAlias("LogFile")
    private String LogFileUrl;

    @JsonProperty("LogFile")
    public String getLogFileUrl() {
        return this.LogFileUrl;
    }

    @JsonProperty("LogFile")
    public void setLogFileUrl(String LogFileUrl) {
        this.LogFileUrl = LogFileUrl;
    }

}