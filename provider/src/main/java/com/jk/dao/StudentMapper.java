package com.jk.dao;

import com.jk.entity.StudentEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StudentMapper {
    List<StudentEntity> findStudent();

    StudentEntity selectStudentById(Integer id);

    void deleteStudent(Integer id);

    void saveOrder(StudentEntity student);

    void xinzheng(StudentEntity student);
}
