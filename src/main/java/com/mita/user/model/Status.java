package com.mita.user.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Status {
    private String code;
    private Date activeDt;
    private Date closeDt;
    private int percentComplete;

}
