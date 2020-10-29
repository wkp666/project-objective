package com.jk.service;

import com.jk.dao.SchoolMapper;
import com.jk.config.PageResult;
import com.jk.entity.SchoolEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService{
    @Resource
    private SchoolMapper schoolMapper;


    @Override
    public PageResult findPage(Integer currPage, Integer pageSize) {
        long total=schoolMapper.count();

        List<SchoolEntity>list=schoolMapper.findPage(currPage,pageSize);

        Long totalPage= total%pageSize==1? total/pageSize : (total/pageSize+1);
        return new PageResult(total,list,currPage,pageSize,totalPage);
    }

    @Override//新增数据
    public void add(SchoolEntity schoo) {
        if (schoo.getSchoolid()==null){
            //id为空执行新增数据
            schoolMapper.add(schoo);
        }else{
            //id不为空执行修改
            schoolMapper.upschool(schoo);
        }

    }

    @Override//单删批删
    public void delAll(String[] ids) {
        schoolMapper.delAll(ids);
    }

    @Override//回显数据
    public SchoolEntity findOne(Integer ids) {
        return schoolMapper.findOne(ids);
    }
}
