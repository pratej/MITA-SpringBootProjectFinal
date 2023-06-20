package com.mita.user.model.userprofile;

import java.time.LocalDateTime;

public class Status {
    private String code;
    private LocalDateTime activeDt;
    private LocalDateTime expiryDt;

    public Status(String code, LocalDateTime activeDt, LocalDateTime expiryDt) {
        this.code = code;
        this.activeDt = activeDt;
        this.expiryDt = expiryDt;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getActiveDt() {
        return activeDt;
    }

    public void setActiveDt(LocalDateTime activeDt) {
        this.activeDt = activeDt;
    }

    public LocalDateTime getExpiryDt() {
        return expiryDt;
    }

    public void setExpiryDt(LocalDateTime expiryDt) {
        this.expiryDt = expiryDt;
    }
// Constructors, getters, and setters
}
