package com.mita.user.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SongInfo {
    private String title;
    private Price price;
    private String about;
    private List<String> audio;
    private List<String> image;

}
