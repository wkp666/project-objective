package com.jk.dao;

import com.jk.entity.Eat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface EatMapper {
    int deleteByPrimaryKey(Integer eatId);

    int insert(Eat record);

    int insertSelective(Eat record);

    Eat selectByPrimaryKey(Integer eatId);

    int updateByPrimaryKeySelective(Eat record);

    int updateByPrimaryKey(Eat record);

    long count(@Param("eat")Eat eat);

    List<Eat> queryEat(@Param("currPage") Integer currPage,@Param("pageSize") Integer pageSize,@Param("eat") Eat eat);

    void del(String[] ids);
}