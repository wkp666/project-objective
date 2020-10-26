package com.jk.service;

import com.jk.dao.SchoolMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SchoolServiceImpl {
    @Resource
    private SchoolMapper schoolMapper;
}
