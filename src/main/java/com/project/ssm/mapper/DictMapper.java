package com.project.ssm.mapper;

import com.project.ssm.model.Dict;

public interface DictMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Dict record);

    int insertSelective(Dict record);

    Dict selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);
}