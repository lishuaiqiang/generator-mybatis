package com.supermap.base.mapper;

import com.supermap.base.pojo.SmPeEmployeeHour;

public interface SmPeEmployeeHourMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmPeEmployeeHour record);

    int insertSelective(SmPeEmployeeHour record);

    SmPeEmployeeHour selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmPeEmployeeHour record);

    int updateByPrimaryKey(SmPeEmployeeHour record);
}