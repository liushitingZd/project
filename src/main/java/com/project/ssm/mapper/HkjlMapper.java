package com.project.ssm.mapper;

import com.project.ssm.model.Hkjl;

public interface HkjlMapper {
    int deleteByPrimaryKey(Integer hid);

    int insert(Hkjl record);

    int insertSelective(Hkjl record);

    Hkjl selectByPrimaryKey(Integer hid);

    int updateByPrimaryKeySelective(Hkjl record);

    int updateByPrimaryKey(Hkjl record);
}