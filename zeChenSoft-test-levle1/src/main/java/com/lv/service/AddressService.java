package com.lv.service;

import com.lv.entity.TAddress;

import java.util.List;

public interface AddressService {
    /**
     * 查询树形结构
     * @return
     */
    TAddress treeArea();

    List<TAddress> treeAddress();

    /**
     * 模糊搜索
     * @param addressName       地区名字
     * @return                  List<TAddress>
     */
    List<TAddress> dimSearch(String addressName);
}
