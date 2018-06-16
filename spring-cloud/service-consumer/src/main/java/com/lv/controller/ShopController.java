package com.lv.controller;

import com.lv.client.MovieServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private MovieServiceClient movieServiceClient;


    //负载均衡客户端
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/buy/movie/{id:\\d+}")
    public String byMovie(@PathVariable Integer id) {

        //使用fegin
        return movieServiceClient.getMovieName(1001);

        //使用ribbon 实现负载均衡,注意路径要加http:// 服务名 + 其他
//        String url = "http://MOVIE-SERVICE-PROVIDER/movie/" + id;
//        return restTemplate.getForObject(url,String.class);


//        //,根据服务名称从Eurake 上发现服务的提供者，使用负载均衡客户端来返回提供者的地址，会自动进行负载均衡
//        ServiceInstance serviceInstance = loadBalancerClient.choose("MOVIE-SERVICE-PROVIDER");
//        String url = "http://" + serviceInstance.getHost()+":"+serviceInstance.getPort()+"movie/" + id;
//
//        System.out.println(serviceInstance.getHost());
//        System.out.println(serviceInstance.getPort());
//        System.out.println(serviceInstance.getMetadata());
//
//        //String url = "http://localhost:8001/movie/"+id;
//        return restTemplate.getForObject(url,String.class);
    }


}
