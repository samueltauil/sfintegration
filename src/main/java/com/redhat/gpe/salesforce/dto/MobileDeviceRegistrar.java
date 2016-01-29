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
 * Salesforce DTO for SObject MobileDeviceRegistrar
 */
@XStreamAlias("MobileDeviceRegistrar")
public class MobileDeviceRegistrar extends AbstractSObjectBase {

    // DeveloperName
    private String DeveloperName;

    @JsonProperty("DeveloperName")
    public String getDeveloperName() {
        return this.DeveloperName;
    }

    @JsonProperty("DeveloperName")
    public void setDeveloperName(String DeveloperName) {
        this.DeveloperName = DeveloperName;
    }

    // Language
    @XStreamConverter(PicklistEnumConverter.class)
    private LanguageEnum Language;

    @JsonProperty("Language")
    public LanguageEnum getLanguage() {
        return this.Language;
    }

    @JsonProperty("Language")
    public void setLanguage(LanguageEnum Language) {
        this.Language = Language;
    }

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

    // NamespacePrefix
    private String NamespacePrefix;

    @JsonProperty("NamespacePrefix")
    public String getNamespacePrefix() {
        return this.NamespacePrefix;
    }

    @JsonProperty("NamespacePrefix")
    public void setNamespacePrefix(String NamespacePrefix) {
        this.NamespacePrefix = NamespacePrefix;
    }

    // Provider
    @XStreamConverter(PicklistEnumConverter.class)
    private ProviderEnum Provider;

    @JsonProperty("Provider")
    public ProviderEnum getProvider() {
        return this.Provider;
    }

    @JsonProperty("Provider")
    public void setProvider(ProviderEnum Provider) {
        this.Provider = Provider;
    }

    // MdmProviderEnrollEndpoint
    private String MdmProviderEnrollEndpoint;

    @JsonProperty("MdmProviderEnrollEndpoint")
    public String getMdmProviderEnrollEndpoint() {
        return this.MdmProviderEnrollEndpoint;
    }

    @JsonProperty("MdmProviderEnrollEndpoint")
    public void setMdmProviderEnrollEndpoint(String MdmProviderEnrollEndpoint) {
        this.MdmProviderEnrollEndpoint = MdmProviderEnrollEndpoint;
    }

    // MdmProviderPushAppEndpoint
    private String MdmProviderPushAppEndpoint;

    @JsonProperty("MdmProviderPushAppEndpoint")
    public String getMdmProviderPushAppEndpoint() {
        return this.MdmProviderPushAppEndpoint;
    }

    @JsonProperty("MdmProviderPushAppEndpoint")
    public void setMdmProviderPushAppEndpoint(String MdmProviderPushAppEndpoint) {
        this.MdmProviderPushAppEndpoint = MdmProviderPushAppEndpoint;
    }

    // MdmProviderApiAccessToken
    private String MdmProviderApiAccessToken;

    @JsonProperty("MdmProviderApiAccessToken")
    public String getMdmProviderApiAccessToken() {
        return this.MdmProviderApiAccessToken;
    }

    @JsonProperty("MdmProviderApiAccessToken")
    public void setMdmProviderApiAccessToken(String MdmProviderApiAccessToken) {
        this.MdmProviderApiAccessToken = MdmProviderApiAccessToken;
    }

    // MdmProviderApiUsername
    private String MdmProviderApiUsername;

    @JsonProperty("MdmProviderApiUsername")
    public String getMdmProviderApiUsername() {
        return this.MdmProviderApiUsername;
    }

    @JsonProperty("MdmProviderApiUsername")
    public void setMdmProviderApiUsername(String MdmProviderApiUsername) {
        this.MdmProviderApiUsername = MdmProviderApiUsername;
    }

    // MdmProviderApiPassword
    private String MdmProviderApiPassword;

    @JsonProperty("MdmProviderApiPassword")
    public String getMdmProviderApiPassword() {
        return this.MdmProviderApiPassword;
    }

    @JsonProperty("MdmProviderApiPassword")
    public void setMdmProviderApiPassword(String MdmProviderApiPassword) {
        this.MdmProviderApiPassword = MdmProviderApiPassword;
    }

}