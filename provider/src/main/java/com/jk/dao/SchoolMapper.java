package com.jk.dao;

import com.jk.entity.SchoolEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SchoolMapper {
    //统计页数
    long count();
    //查询所有数据
    List<SchoolEntity> findPage(@Param("currPage") Integer currPage,@Param("pageSize") Integer pageSize);
    //新增数据
    void add(SchoolEntity schoo);
    //修改数据
    void upschool(SchoolEntity schoo);
    //单删批删
    void delAll(@Param("ids")String[] ids);
    //回显数据
    SchoolEntity findOne(@Param("ids") Integer ids);
}
