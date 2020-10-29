package com.jk.service;

import com.jk.config.PageResult;
import com.jk.entity.SchoolEntity;

public interface SchoolService {
    //分页查询
    PageResult findPage(Integer currPage, Integer pageSize);
    //新增数据
    void add(SchoolEntity schoo);
    //单删批删
    void delAll(String[] ids);
    //回显数据
    SchoolEntity findOne(Integer ids);
}
