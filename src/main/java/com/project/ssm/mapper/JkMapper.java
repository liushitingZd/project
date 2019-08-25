package com.project.ssm.mapper;

import com.project.ssm.model.Jk;

public interface JkMapper {
    int deleteByPrimaryKey(Integer jid);

    int insert(Jk record);

    int insertSelective(Jk record);

    Jk selectByPrimaryKey(Integer jid);

    int updateByPrimaryKeySelective(Jk record);

    int updateByPrimaryKey(Jk record);
}