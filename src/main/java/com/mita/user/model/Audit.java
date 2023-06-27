package com.mita.user.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Audit {
    private String updatedBy;
    private Date updateDt;
}

