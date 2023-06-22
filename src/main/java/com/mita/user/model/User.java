package com.mita.user.model;

import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.mita.user.model.base.Address;
import com.mita.user.model.base.HumanName;
import com.mita.user.model.base.ModelBase;

/**
 * This stores User Profile
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "user")
public class User extends ModelBase {

    // The ID of the user
    private String id;

    // UserName of the user
    private String userName;

    // Type of the user
    private String userType;

    // URI of the user
    private String uri;

    // Name of the user
    private HumanName name;

    // Gender of the user
    private String gender;

    // Status of the user. This can be ACTIVE/ DELETED etc.
    private String status;

    // Address of the user
    private Address address;

    // E-Mail ID of the user
    private String email;

    // BirthDate of the user
    private String birthdate;

    // Images of the user
    private Map<String, String> userImages;

    // External URLS of the user. For e,g, Spotify, Tiktok handle etc.
    private Map<String, String> externalUrl;

    // Tags associated to the user
    private Map<String, String> userTags;

    // Explicit content indicators for user. For e.g. "filter_enabled":"false"/
    // "filter_locked":"false"
    private Map<String, String> explicitContent;

    // Policies applicable to the user for user. For e.g.
    // "opt_in_trial_premium_only_market":"false"
    private Map<String, String> policies;

    // Is the KYC review complete for user
    private String kycReview;

    // KYC status for user
    private String kycStatus;

    // AML status for user
    private String amlStatus;

    /*
     * Users Social stats (Followers/ Following will be stored separately in twitter
     * sort of application.
     */

    /*
     * These will also be stored separately: UserSetting, UserWallet
     */

    public static void main(String[] args) {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public HumanName getName() {
        return name;
    }

    public void setName(HumanName name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Map<String, String> getUserImages() {
        return userImages;
    }

    public void setUserImages(Map<String, String> userImages) {
        this.userImages = userImages;
    }

    public Map<String, String> getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(Map<String, String> externalUrl) {
        this.externalUrl = externalUrl;
    }

    public Map<String, String> getUserTags() {
        return userTags;
    }

    public void setUserTags(Map<String, String> userTags) {
        this.userTags = userTags;
    }

    public Map<String, String> getExplicitContent() {
        return explicitContent;
    }

    public void setExplicitContent(Map<String, String> explicitContent) {
        this.explicitContent = explicitContent;
    }

    public Map<String, String> getPolicies() {
        return policies;
    }

    public void setPolicies(Map<String, String> policies) {
        this.policies = policies;
    }

    public String getKycReview() {
        return kycReview;
    }

    public void setKycReview(String kycReview) {
        this.kycReview = kycReview;
    }

    public String getKycStatus() {
        return kycStatus;
    }

    public void setKycStatus(String kycStatus) {
        this.kycStatus = kycStatus;
    }

    public String getAmlStatus() {
        return amlStatus;
    }

    public void setAmlStatus(String amlStatus) {
        this.amlStatus = amlStatus;
    }

}
