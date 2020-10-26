package com.jk.dao;

import com.jk.entity.SchoolEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SchoolMapper {
    //统计总条数
    long count();
    //查询所有数据
    List<SchoolEntity> findShcool(Integer currPage, Integer pageSize);
    //新增数据
    void addSchool(SchoolEntity school);
    //修改数据
    void upSchool(SchoolEntity school);
    //单删
    void delSchool(Integer ids);
    //回显数据
    SchoolEntity findOne(Integer ids);
}
