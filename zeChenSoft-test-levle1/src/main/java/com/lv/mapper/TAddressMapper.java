package com.lv.mapper;

import com.lv.entity.TAddress;
import com.lv.entity.TAddressExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TAddressMapper {
    long countByExample(TAddressExample example);

    int deleteByExample(TAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAddress record);

    int insertSelective(TAddress record);

    List<TAddress> selectByExample(TAddressExample example);

    TAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAddress record, @Param("example") TAddressExample example);

    int updateByExample(@Param("record") TAddress record, @Param("example") TAddressExample example);

    int updateByPrimaryKeySelective(TAddress record);

    int updateByPrimaryKey(TAddress record);

    /**
     * 查询属性结构
     * @return
     */
    TAddress selectTree();

    List<TAddress> selectAddress();

}