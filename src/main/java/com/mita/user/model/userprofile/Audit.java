package com.mita.user.model.userprofile;

import java.time.LocalDateTime;

public class Audit {
    private String updatedBy;
    private LocalDateTime updateDt;
    private String createdBy;
    private LocalDateTime createDt;

    // Constructors, getters, and setters

    public Audit(String updatedBy, LocalDateTime updateDt, String createdBy, LocalDateTime createDt) {
        this.updatedBy = updatedBy;
        this.updateDt = updateDt;
        this.createdBy = createdBy;
        this.createDt = createDt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(LocalDateTime updateDt) {
        this.updateDt = updateDt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreateDt() {
        return createDt;
    }

    public void setCreateDt(LocalDateTime createDt) {
        this.createDt = createDt;
    }
}