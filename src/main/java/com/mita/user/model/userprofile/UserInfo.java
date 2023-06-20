package com.mita.user.model.userprofile;

import java.util.List;

public class UserInfo {
    private String name;
    private String email;
    private String address;
    private List<String> image;


    public UserInfo(String name, String email, String address, List<String> image) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.image = image;
    }

    // Constructors, getters, and setters
}
