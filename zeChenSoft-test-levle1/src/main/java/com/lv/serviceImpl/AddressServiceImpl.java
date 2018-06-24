package com.lv.serviceImpl;


import com.lv.entity.TAddress;
import com.lv.entity.TAddressExample;
import com.lv.mapper.TAddressMapper;
import com.lv.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {


    @Autowired
    private TAddressMapper tAddressMapper;

    /**
     * 查询树形结构
     *
     * @return
     */
    @Override
    public TAddress treeArea() {
        return tAddressMapper.selectTree();
    }

    @Override
    public List<TAddress> treeAddress() {
        return tAddressMapper.selectAddress();
    }

    /**
     * 模糊搜索
     *
     * @param addressName 地区名字
     * @return List<TAddress>
     */
    @Override
    public List<TAddress> dimSearch(String addressName) {
        TAddressExample tAddressExample = new TAddressExample();
        tAddressExample.createCriteria().andAddressNameLike("%"+addressName+"%");

        return tAddressMapper.selectByExample(tAddressExample);
    }
}
