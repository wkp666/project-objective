package com.jk.service;

import com.jk.dao.StudentMapper;
import com.jk.entity.StudentEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements  StudentService{
    @Resource
    private StudentMapper studentMapper;
    @Override
    public List<StudentEntity> findStudent() {
        return studentMapper.findStudent();
    }

    @Override
    public StudentEntity selectStudentById(Integer id) {
        return studentMapper.selectStudentById(id);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentMapper.deleteStudent(id);
    }

    @Override
    public void saveOrder(StudentEntity student) {
        studentMapper.saveOrder(student);
    }

    @Override
    public void xinzheng(StudentEntity student) {
        studentMapper.xinzheng(student);
    }

    @Override
    public StudentEntity tostudenttiaoban(Integer id) {
        return studentMapper.tostudenttiaoban(id);
    }
}
