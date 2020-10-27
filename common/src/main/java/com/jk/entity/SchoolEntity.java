package com.jk.entity;

import lombok.Data;

@Data
public class SchoolEntity {
    //id
    private Integer sId;
    //学校名称
    private String  sName;
    //类型表
    private Integer typeId;
    //所在地
    private String  sLocation;
    //时间
    private String  sDate;
    //管理员
    private String  sGly;
    //描述
    private String  sdesc;

    //业务字段
    private String cName;

}
