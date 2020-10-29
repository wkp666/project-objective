package com.jk.dao;

import com.jk.entity.ClassEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ClassMapper {
    List<ClassEntity> findClass();

    void deleteClass(Integer id);

    ClassEntity selectClassById(Integer id);

    void addClass(ClassEntity clist);
}
