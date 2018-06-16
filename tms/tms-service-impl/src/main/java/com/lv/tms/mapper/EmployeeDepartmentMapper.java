package com.lv.tms.mapper;

import com.lv.tms.entity.EmployeeDepartmentExample;
import com.lv.tms.entity.EmployeeDepartmentKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeDepartmentMapper {
    long countByExample(EmployeeDepartmentExample example);

    int deleteByExample(EmployeeDepartmentExample example);

    int deleteByPrimaryKey(EmployeeDepartmentKey key);

    int insert(EmployeeDepartmentKey record);

    int insertSelective(EmployeeDepartmentKey record);

    List<EmployeeDepartmentKey> selectByExample(EmployeeDepartmentExample example);

    int updateByExampleSelective(@Param("record") EmployeeDepartmentKey record, @Param("example") EmployeeDepartmentExample example);

    int updateByExample(@Param("record") EmployeeDepartmentKey record, @Param("example") EmployeeDepartmentExample example);
}