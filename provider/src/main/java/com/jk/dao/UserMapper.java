package com.jk.dao;

import com.jk.entity.SchoolEntity;
import com.jk.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    //测试类型查询
    List<User> find();
    //测试学校查询
    List<SchoolEntity> school();
}
