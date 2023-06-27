package com.mita.user.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Stats {
    private Popularity popularity;
    private Music music;
    private Market market;


    public Stats() {

    }
}

