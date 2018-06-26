package com.supermap.base.mapper;

import com.supermap.base.pojo.smPeEmployeeHour;

public interface smPeEmployeeHourMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(smPeEmployeeHour record);

    int insertSelective(smPeEmployeeHour record);

    smPeEmployeeHour selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(smPeEmployeeHour record);

    int updateByPrimaryKey(smPeEmployeeHour record);
}