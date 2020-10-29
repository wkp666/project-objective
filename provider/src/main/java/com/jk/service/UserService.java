package com.jk.service;

import com.jk.entity.SchoolEntity;
import com.jk.entity.User;

import java.util.List;

public interface UserService {
    //测试类型查询
    List<User> find();
    //测试学校管理查询
    List<SchoolEntity> school();


}
