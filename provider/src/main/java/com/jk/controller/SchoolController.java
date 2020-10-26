package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.SchoolEntity;
import com.jk.service.SchoolService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SchoolController {
    @Resource
    private SchoolService schoolService;
    /*
    * 学校管理分页
    * */
    @RequestMapping("/findSchool")
    public PageResult findSchool (@RequestParam(value = "currPage")Integer currPage,@RequestParam(value = "pageSize")Integer pageSize){
        return schoolService.findSchool(currPage,pageSize);
    }
    /*
    * 学校管理新增数据
    * */
    @RequestMapping("/addSchool")
    public void addSchool(SchoolEntity school){
        schoolService.addSchool(school);
    }
    /*
    * 单删
    * */
    @RequestMapping("/delSchool")
    public void delSchool(Integer ids){
        schoolService.delSchool(ids);
    }
    /*
    * 回显数据
    * */
    @RequestMapping("/findOne")
    public SchoolEntity findOne(Integer ids){
        return schoolService.findOne(ids);
    }
}
