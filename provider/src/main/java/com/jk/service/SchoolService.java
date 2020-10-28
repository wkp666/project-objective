package com.jk.service;

import com.jk.entity.PageResult;
import com.jk.entity.SchoolEntity;

public interface SchoolService {
    //学校管理分页查询
    PageResult findSchool(Integer currPage, Integer pageSize);
    //新增数据
    void addSchool(SchoolEntity school);
    //单删 批删除数据
    void delSchool(String[] ids);
    //回显数据
    SchoolEntity findOne(Integer ids);
}
