package com.mita.user.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Genre {

    private String genreId;
    private String name;
    private List<Artist> artists;
}
