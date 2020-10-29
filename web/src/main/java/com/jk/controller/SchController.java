package com.jk.controller;

import com.jk.config.PageResult;
import com.jk.entity.SchoolEntity;
import com.jk.service.schService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SchController {
    @Resource
    private schService schoolService;

    //查询数据分页
    @RequestMapping("/findAll")
    public PageResult findAll(@RequestParam Integer currPage, @RequestParam Integer pageSize){
        return schoolService.findPage(currPage,pageSize);
    }
    //新增数据 修改数据
    @RequestMapping("/add")
    public void add(@RequestBody SchoolEntity schoo){
        schoolService.add(schoo);
    }
    //单删批删
    @RequestMapping("/del")
    public void delAll(@RequestParam String[] ids){
        schoolService.delAll(ids);
    }
    //回显数据
    @RequestMapping("/findOne")
    public SchoolEntity findOne(@RequestParam Integer ids){
        return schoolService.findOne(ids);
    }
}
