package com.jk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class Eat {
    private Integer eatId;

    private String eatSchool;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    private String breakfast;

    private String morning;

    private String afternoon;

}