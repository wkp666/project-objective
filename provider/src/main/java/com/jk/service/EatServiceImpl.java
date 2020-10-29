package com.jk.service;

import com.jk.config.PageResult;
import com.jk.dao.EatMapper;
import com.jk.entity.Eat;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EatServiceImpl implements EatService{
    @Resource
    private EatMapper eatMapper;

    @Override//食谱分页查询
    public PageResult queryEat(Integer currPage, Integer pageSize ,Eat eat) {
        long total=eatMapper.count(eat);
        List<Eat>list=eatMapper.queryEat(currPage,pageSize,eat);
        Long totalPage= total%pageSize==1? total/pageSize : (total/pageSize+1);
        return new PageResult(total,list,currPage,pageSize,totalPage);
    }

    @Override  //新增删除
    public void insert(Eat eat) {
        if (eat.getEatId()==null){
            //执行新增方法
            eatMapper.insert(eat);
        }else{
            //id不为空执行修改
            eatMapper.updateByPrimaryKeySelective(eat);
        }
    }

    @Override
    public Eat findOne(Integer ids) {
        return eatMapper.selectByPrimaryKey(ids);
    }

    @Override
    public void del(String[] ids) {
        eatMapper.del(ids);
    }
}
