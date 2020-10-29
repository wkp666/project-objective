package com.jk.service;

import com.jk.config.PageResult;
import com.jk.entity.Eat;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider")
public interface EatService {
    //食谱分页查询
    @RequestMapping("/queryEat")
    public PageResult queryEat(@RequestParam Integer currPage,@RequestParam Integer pageSize,@RequestBody Eat eat);

    //新增数据
    @RequestMapping("/insert")
    public void insert(@RequestBody Eat eat);

    //回显数据
    @RequestMapping("/queryOne")
    public Eat findOne(@RequestParam Integer ids);

    //单删批删
    @RequestMapping("/del")
    public void del(@RequestParam String[] ids);
}
