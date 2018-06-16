package com.lv.tms.mapper;

import com.lv.tms.entity.StoreAccountLoginLog;
import com.lv.tms.entity.StoreAccountLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreAccountLoginLogMapper {
    long countByExample(StoreAccountLoginLogExample example);

    int deleteByExample(StoreAccountLoginLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StoreAccountLoginLog record);

    int insertSelective(StoreAccountLoginLog record);

    List<StoreAccountLoginLog> selectByExample(StoreAccountLoginLogExample example);

    StoreAccountLoginLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StoreAccountLoginLog record, @Param("example") StoreAccountLoginLogExample example);

    int updateByExample(@Param("record") StoreAccountLoginLog record, @Param("example") StoreAccountLoginLogExample example);

    int updateByPrimaryKeySelective(StoreAccountLoginLog record);

    int updateByPrimaryKey(StoreAccountLoginLog record);
}