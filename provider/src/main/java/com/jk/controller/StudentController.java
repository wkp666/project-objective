package com.jk.controller;

import com.jk.entity.StudentEntity;
import com.jk.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("findStudent")
    public List<StudentEntity> findStudent(){
        return studentService.findStudent();
    }

    @RequestMapping("selectStudentById")
    public StudentEntity selectStudentById(@RequestParam Integer id){
        return  studentService.selectStudentById(id);
    }

    //删除
    @RequestMapping("deleteStudent")
    public  void deleteStudent(@RequestParam Integer id){
        studentService.deleteStudent(id);
    }

    //修改
    @RequestMapping("saveOrder")
    public void saveOrder(@RequestBody StudentEntity student){
        studentService.saveOrder(student);
    }
    //新增
    @RequestMapping("xinzheng")
    public void xinzheng(@RequestBody StudentEntity student){
        studentService.xinzheng(student);
    }


}
