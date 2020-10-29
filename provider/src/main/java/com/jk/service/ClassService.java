package com.jk.service;

import com.jk.entity.ClassEntity;

import java.util.List;

public interface ClassService {
    List<ClassEntity> findClass();

    void deleteClass(Integer id);

    ClassEntity selectClassById(Integer id);

    void addClass(ClassEntity clist);
}
