package com.lv.controller;

import com.lv.entity.Permission;
import com.lv.entity.TAddress;
import com.lv.service.AddressService;
import com.lv.service.PermissionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test/test")
public class TestController {

    @Autowired
    private PermissionService permissionService;
    @Autowired
    private AddressService addressService;


    /**
     * 第一题
     * @return
     */
    @GetMapping("/one")
    public String testOne() {
        return "test/testOne";
    }

    /**
     * 第二题
     * @return
     */
    @GetMapping("two")
    public String testTwo() {
        return "test/testTwo";
    }

    /**
     * 第三题
     * @return
     */
    @GetMapping("three")
    public String testThree() {
        return "test/testThree";
    }

    /**
     * 第四题
     * @param model
     * @return
     */
    @GetMapping("/four")
    public String testTwo(Model model) {

        //将数据传到前端去
        List<TAddress> tAddressList = addressService.treeAddress();
        model.addAttribute("tAddressList", tAddressList);


        List<Permission> permissionList = permissionService.selectAllPermission();
        model.addAttribute("permissionList", permissionList);
        return "test/testFour";
    }

    /**
     * 第五题
     * @return
     */
    @GetMapping("five")
    public String testFive() {
        return "test/testFive";
    }

    @PostMapping("five")
    public String testFive(String addressName,
                           Model model){
        //完成模糊搜索功能

        if (StringUtils.isEmpty(addressName)){
            addressName = "南";
        }
        List<TAddress> tAddressList = addressService.dimSearch(addressName);

        model.addAttribute("tAddress",tAddressList);
        return "test/testFive";
    }

}
