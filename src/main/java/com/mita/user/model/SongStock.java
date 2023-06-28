package com.mita.user.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class SongStock {
    private String songStockId;
    private SongInfo info;
    private Price price;
    private Song song;
    private Artist artist;
    private Stats stats;
    private List<Source> sources;
    private History history;
    private Audit audit;
    private List<String> tags;
}
