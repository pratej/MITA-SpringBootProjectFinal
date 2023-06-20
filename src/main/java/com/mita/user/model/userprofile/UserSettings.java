package com.mita.user.model.userprofile;

public class UserSettings {
    private boolean reinvestRoyalties;

    // Constructors, getters, and setters

    public UserSettings(boolean reinvestRoyalties) {
        this.reinvestRoyalties = reinvestRoyalties;
    }

    public boolean isReinvestRoyalties() {
        return reinvestRoyalties;
    }

    public void setReinvestRoyalties(boolean reinvestRoyalties) {
        this.reinvestRoyalties = reinvestRoyalties;
    }
}
