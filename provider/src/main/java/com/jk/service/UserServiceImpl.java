package com.jk.service;

import com.jk.dao.UserMapper;
import com.jk.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper user;

    @Override
    public List<User> find() {
        return user.find();
    }
}
