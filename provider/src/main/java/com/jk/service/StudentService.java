package com.jk.service;

import com.jk.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    List<StudentEntity> findStudent();

    StudentEntity selectStudentById(Integer id);

    void deleteStudent(Integer id);

    void saveOrder(StudentEntity student);

    void xinzheng(StudentEntity student);
}
