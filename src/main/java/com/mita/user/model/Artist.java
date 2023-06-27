package com.mita.user.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Artist {
    private String id;
    private String name;
    private String description;
    private List<String> image;

}
