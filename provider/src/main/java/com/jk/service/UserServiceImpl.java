package com.jk.service;

import com.jk.dao.UserMapper;
import com.jk.entity.SchoolEntity;
import com.jk.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper user;

    @Override//测试类型查询
    public List<User> find() {
        return user.find();
    }

    @Override//测试学校管理查询
    public List<SchoolEntity> school() {
        return user.school();
    }
}
