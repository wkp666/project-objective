package com.jk.service;

import com.jk.dao.ClassMapper;
import com.jk.entity.ClassEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassServiceImpl implements ClassService{
    @Resource
    private ClassMapper classMapper;

    @Override
    public List<ClassEntity> findClass() {
        return classMapper.findClass();
    }

    @Override
    public void deleteClass(Integer id) {
        classMapper.deleteClass(id);

    }

    @Override
    public ClassEntity selectClassById(Integer id) {
        return classMapper.selectClassById(id);
    }

    @Override
    public void addClass(ClassEntity clist) {
        classMapper.addClass(clist);
    }
}
