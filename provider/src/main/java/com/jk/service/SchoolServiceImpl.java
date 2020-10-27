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
    public PageResult findSchool(Integer currPage, Integer pageSize) {
        //统计总数量
        long total = schoolMapper.count();
        //查询所有数据
        List<SchoolEntity> list=schoolMapper.findShcool(currPage,pageSize);

        long totalPage=total%pageSize==1? total/pageSize : (total/pageSize+1);

        return new PageResult(total,list,currPage,pageSize,totalPage);
    }
    @Override//新增数据  修改数据
    public void addSchool(SchoolEntity school) {
        if(school.getSId()==null){
            //执行新增的方法
            schoolMapper.addSchool(school);
        }else{
            //ID不为空执行修改的方法
            schoolMapper.upSchool(school);
        }
    }
    @Override//学校的单删的方式
    public void delSchool(String[] ids) {
        schoolMapper.delSchool(ids);
    }

    @Override//回显数据
    public SchoolEntity findOne(Integer ids) {
        return schoolMapper.findOne(ids);
    }
}
