package com.jk.service;

import com.jk.entity.PageResult;
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
    @RequestMapping("/findSchool")
    public PageResult findSchool (@RequestParam(value = "currPage")Integer currPage, @RequestParam(value = "pageSize")Integer pageSize);
    /*
     * 学校管理新增数据
     * */
    @RequestMapping("/addSchool")
    public void addSchool(@RequestBody SchoolEntity school);

    /*
     * 单删
     * 批删
     * */
    @RequestMapping("/delSchool")
    public void delSchool(@RequestParam String[] ids);
    /*
     * 回显数据
     * */
    @RequestMapping("/findOne")
    public SchoolEntity findOne(@RequestParam Integer ids);
}
