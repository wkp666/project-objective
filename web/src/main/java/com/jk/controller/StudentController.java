package com.jk.controller;

import com.jk.entity.StudentEntity;
import com.jk.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;
    //查询
    @RequestMapping("findStudent")
    public String findStudent(Model model){
        List<StudentEntity> stulist=studentService.findStudent();
        model.addAttribute("stulist",stulist);
        model.addAttribute("indexPage",1);
        model.addAttribute("totalPage",1);
        return "studentList" ;
    }
    //回显
    @RequestMapping("selectStudentById")
    public String selectStudentById(Integer id,Model model){
        StudentEntity student= studentService.selectStudentById(id);
        model.addAttribute("student",student);
        return "addstudent";
    }
    @RequestMapping("deleteStudent")
    public  String deleteStudent(Integer id){
        studentService.deleteStudent(id);
        return "redirect:findStudent";
    }
    @RequestMapping("saveOrder")
    public String saveOrder(StudentEntity student){
        studentService.saveOrder(student);
        return "redirect:findStudent";
    }

    @RequestMapping("toAdd")
    public String toAdd(Model model){
        model.addAttribute("student",new StudentEntity());
        return "updatestudent";
    }
    @RequestMapping("xinzheng")
    public String xinzheng(StudentEntity student){
        studentService.xinzheng(student);
        return "redirect:findStudent";
    }
    @RequestMapping("findStudent2")
    @ResponseBody
    public List<StudentEntity> findStudent(){
        return studentService.findStudent();
    }

    @RequestMapping("tree")
    public String start(){
        return "tree";
    }
    @RequestMapping("home")
    public String home(){
        return "home";
    }
    //跳调班
    @RequestMapping("tostudenttiaoban")
    public String tostudenttiaoban(Model model,Integer id){
        StudentEntity student = studentService.tostudenttiaoban(id);
        model.addAttribute("student",student);
        return "studenttiaoban";
    }
}
