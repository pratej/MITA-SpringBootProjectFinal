package com.mita.user.model.userprofile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile {

    @Id
    private String userId;
    private String password;
    private UserInfo info;
    private Status status;
    private List<Wallet> wallet;
    private UserSettings userSettings;
    private Audit audit;
    private List<String> tags;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserInfo getInfo() {
        return info;
    }

    public void setInfo(UserInfo info) {
        this.info = info;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Wallet> getWallet() {
        return wallet;
    }

    public void setWallet(List<Wallet> wallet) {
        this.wallet = wallet;
    }

    public UserSettings getUserSettings() {
        return userSettings;
    }

    public void setUserSettings(UserSettings userSettings) {
        this.userSettings = userSettings;
    }

    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
// Constructors, getters, and setters
}