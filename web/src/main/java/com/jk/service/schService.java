package com.jk.service;

import com.jk.config.PageResult;
import com.jk.entity.SchoolEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider")
public interface schService {
    /*
    * 学校管理分页查询
    * */
    @RequestMapping("/findPage")
    public PageResult findPage(@RequestParam Integer currPage,@RequestParam Integer pageSize);

    //新增数据
    @RequestMapping("/add")
    public void add(@RequestBody SchoolEntity schoo);

    //单删批删
    @RequestMapping("/delAll")
    public void delAll(@RequestParam String[] ids);

    //回显数据
    @RequestMapping("/findOne")
    public SchoolEntity findOne(@RequestParam Integer ids);
}
