package com.jk.service;

import com.jk.entity.StudentEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "provider")
public interface StudentService {
    @RequestMapping("findStudent")
    public List<StudentEntity> findStudent();
    @RequestMapping("selectStudentById")
    public StudentEntity selectStudentById(@RequestParam Integer id);
    @RequestMapping("deleteStudent")
    public  void deleteStudent(@RequestParam Integer id);
    @RequestMapping("saveOrder")
    public void saveOrder(@RequestBody StudentEntity student);
    @RequestMapping("xinzheng")
    public void xinzheng(@RequestBody StudentEntity student);
    @RequestMapping("tostudenttiaoban")
    public  StudentEntity tostudenttiaoban(@RequestParam Integer id);
}
