package com.mita.user.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Song {
    private String id;
    private String title;
    private String description;
    private List<String> audio;
    private List<String> image;

}
