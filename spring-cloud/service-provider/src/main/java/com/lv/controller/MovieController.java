package com.lv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    /**
     * 对外提供一个服务，根据id查找对应的电影
     * @param id
     * @return
     */
    @GetMapping("/{id:\\d+}")
    public String getMovie(@PathVariable Integer id){
        System.out.println("id: ->" + id);
        return "无间道2";
    }

}
