package com.jk.controller;

import com.jk.entity.ClassEntity;
import com.jk.entity.StudentEntity;
import com.jk.service.ClassService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ClassController {
    @Resource
    private ClassService classService;
    @RequestMapping("findClass")
    public List<ClassEntity> findClass(){
        return classService.findClass();
    }
    @RequestMapping("deleteClass")
    public void deleteClass(@RequestParam Integer id){
        classService.deleteClass(id);
    }
    @RequestMapping("selectClassById")
    public ClassEntity selectClassById(@RequestParam Integer id){
        return classService.selectClassById(id);
    }
    @RequestMapping("addClass")
    public void addClass(@RequestBody ClassEntity clist){
        classService.addClass(clist);
    }
}
