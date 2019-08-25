package com.project.ssm.mapper;

import com.project.ssm.model.Nr;

public interface NrMapper {
    int deleteByPrimaryKey(Integer nid);

    int insert(Nr record);

    int insertSelective(Nr record);

    Nr selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(Nr record);

    int updateByPrimaryKey(Nr record);
}