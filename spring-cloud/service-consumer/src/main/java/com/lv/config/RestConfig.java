package com.lv.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {


    @Bean
    @LoadBalanced
    //将会使用ribbon 自动从注册中心发现服务，并采用轮询的方式进行负载均衡调用
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
