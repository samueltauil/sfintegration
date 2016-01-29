/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type StaticResource
 */
public class QueryRecordsStaticResource extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<StaticResource> records;

    public List<StaticResource> getRecords() {
        return records;
    }

    public void setRecords(List<StaticResource> records) {
        this.records = records;
    }
}