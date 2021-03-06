/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 29 00:57:07 BRST 2016
 */
package com.redhat.gpe.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type TenantSecret
 */
public class QueryRecordsTenantSecret extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<TenantSecret> records;

    public List<TenantSecret> getRecords() {
        return records;
    }

    public void setRecords(List<TenantSecret> records) {
        this.records = records;
    }
}
