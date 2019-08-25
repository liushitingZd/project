package com.project.ssm.mapper;

import com.project.ssm.model.Lx;

public interface LxMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(Lx record);

    int insertSelective(Lx record);

    Lx selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(Lx record);

    int updateByPrimaryKey(Lx record);
}