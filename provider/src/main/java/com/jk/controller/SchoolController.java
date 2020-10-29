package com.jk.controller;

import com.jk.config.PageResult;
import com.jk.entity.SchoolEntity;
import com.jk.service.SchoolService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
//@RefreshScope   @RefreshScope注解只需要写在需要刷新配置文件的地方，不一定非要在启动类中
@RestController
public class SchoolController {
    @Resource
    private SchoolService schoolService;
    //分页查询数据
    @RequestMapping("/findPage")
    public PageResult findPage(@RequestParam Integer currPage,@RequestParam Integer pageSize){
        return schoolService.findPage(currPage,pageSize);
    }
    //新增数据
    @RequestMapping("/add")
    public void add(@RequestBody SchoolEntity schoo){
        schoolService.add(schoo);
    }
    //单删批删
    @RequestMapping("/delAll")
    public void delAll(@RequestParam String[] ids){
        schoolService.delAll(ids);
    }
    //回显数据
    @RequestMapping("/findOne")
    public SchoolEntity findOne(@RequestParam Integer ids){
        return schoolService.findOne(ids);
    }

}