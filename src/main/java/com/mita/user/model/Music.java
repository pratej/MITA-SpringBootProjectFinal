package com.mita.user.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Music {
    private int streamers;
    private int shows;
    private double royalties;
    private Date payDay;

}
