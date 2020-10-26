package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    /*
    * 跳转页面
    * */
    @RequestMapping("/find")
    public String find(){
        return "学校管理";
    }
}
