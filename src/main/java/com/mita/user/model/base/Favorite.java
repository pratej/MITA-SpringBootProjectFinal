package com.mita.user.model.base;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Favorite {

    // It can be 'SONG', 'ARTIST', SONGSHARE', 'ARTISTETF', 'GENREETF' etc.
    private String type;

    // Unique ID of favorite item
    private String id;

    // Name of the favorite item
    private String name;

    @JsonProperty("timestamp")
    private Date timestamp;


}
