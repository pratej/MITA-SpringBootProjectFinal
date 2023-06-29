package com.mita.user.model;

import com.mita.user.model.base.HumanName;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Artist extends User{

    private String id;
    private HumanName humanName;
    private String description;
    private List<String> image;
    private List<String> songs;
    private List<String> genres;
    private int followersCount;
    private Map<String, String> socialMediaLinks;
    private List<String> albums;
    private List<String> events;


}
