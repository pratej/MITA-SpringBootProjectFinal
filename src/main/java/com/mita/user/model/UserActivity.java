package com.mita.user.model;

import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.mita.user.model.base.ModelBase;

/**
 * This stores User Activity
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "userActivity")
public class UserActivity extends ModelBase {

    private String id;

    // The ID of the user who performed the activity
    private String userId;

    // The type of activity (e.g. "login", "logout", "post created", etc.)
    private String activityType;

    // These are the ENUM values for the activityType
    private String activityCd;

    // This is the Activity description
    private String activityDesc;

    // This is the Activity Status
    private String activityStatus;

    // This is the user Session Id
    private String sessionId;

    // This is the user Transaction Id
    private String transactionId;

    // This is the user workflow Id
    private String workflowId;

    // This can be used to store additional metadata about the Activity
    private Map<String, String> activityMetadata;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getActivityCd() {
        return activityCd;
    }

    public void setActivityCd(String activityCd) {
        this.activityCd = activityCd;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }

    public Map<String, String> getActivityMetadata() {
        return activityMetadata;
    }

    public void setActivityMetadata(Map<String, String> activityMetadata) {
        this.activityMetadata = activityMetadata;
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
