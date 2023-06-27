package com.mita.user.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SongImo {
    private String songImoId;
    private SongInfo info;
    private Song song;
    private Artist artist;
    private Status status;
    private Stats stats;
    private List<Source> sources;
    private History history;
    private Audit audit;
    private List<String> tags;

}
