/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type Lead
 */
public class QueryRecordsLead extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<Lead> records;

    public List<Lead> getRecords() {
        return records;
    }

    public void setRecords(List<Lead> records) {
        this.records = records;
    }
}