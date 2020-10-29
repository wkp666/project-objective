package com.jk.controller;

import com.jk.config.PageResult;
import com.jk.entity.Eat;
import com.jk.service.EatService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EatController {
    @Resource
    private EatService eatService;

    //食谱分页查询
    @RequestMapping("/queryEat")
    public PageResult queryEat(@RequestParam Integer currPage, @RequestParam Integer pageSize,@RequestBody Eat eat){
        return eatService.queryEat(currPage,pageSize,eat);
    }
    //新增数据
    @RequestMapping("/insert")
    public void insert(@RequestBody Eat eat){
        eatService.insert(eat);
    }
    //回显数据
    @RequestMapping("/queryOne")
    public Eat findOne(@RequestParam Integer ids){
        return eatService.findOne(ids);
    }
    //单删批删
    @RequestMapping("/del")
    public void del(@RequestParam String[] ids){
        eatService.del(ids);
    }
}
