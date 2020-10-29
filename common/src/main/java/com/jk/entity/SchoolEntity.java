package com.jk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class SchoolEntity {
    //id
    private Integer schoolid;
    //学校名称
    private String  schoolname;
    //类型表
    private Integer typeId;
    //所在地
    private String  schoolLocation;
    //时间
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date schooldate;
    //管理员
    private String  schoolgly;
    //描述
    private String  schooldesc;

    //业务字段
    private String cname;

}
