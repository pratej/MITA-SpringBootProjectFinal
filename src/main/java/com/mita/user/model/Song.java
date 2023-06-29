package com.mita.user.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Song {

    private String id;
    private String title;
    private String Composers;
    private String Genre;
    private String featuredArtists;
    private String description;
    private List<String> audio;
    private String album;
    private List<String> image;
    private String language;
    private Date releaseDate;

}
