package com.jk.service;

import com.jk.config.PageResult;
import com.jk.entity.Eat;

public interface EatService {
    //食谱分页查询
    PageResult queryEat(Integer currPage, Integer pageSize,Eat eat);
    //新增数据
    void insert(Eat eat);
    //回显数据
    Eat findOne(Integer ids);
    //单删批删
    void del(String[] ids);
}
