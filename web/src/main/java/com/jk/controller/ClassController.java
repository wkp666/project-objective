package com.jk.controller;

import com.jk.entity.ClassEntity;
import com.jk.service.ClassService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ClassController {
    @Resource
    private ClassService classService;
    @RequestMapping("findClass")
    public String findClass(Model model){
       List<ClassEntity> clist= classService.findClass();
        model.addAttribute("clist",clist);
        return "classList";
    }
    @RequestMapping("deleteClass")
    public String deleteClass(Integer id){
        classService.deleteClass(id);
        return "redirect:findClass";
    }
    @RequestMapping("selectClassById")
    public String selectClassById(Integer id,Model model){
        ClassEntity clist = classService.selectClassById(id);
        model.addAttribute("clist",clist);
        return "updateclass";
    }
    @RequestMapping("addClass")
    public String addClass(ClassEntity clist){
        classService.addClass(clist);
        return "redirect:findClass";
    }
    @RequestMapping("toaddclass")
    public String toaddclass(Model model){
        model.addAttribute("kecheng",new ClassEntity());
    return "addclass";
    }
}
