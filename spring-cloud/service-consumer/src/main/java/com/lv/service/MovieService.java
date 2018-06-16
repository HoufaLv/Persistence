package com.lv.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 可以动态修改线程池数量
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "getMoveNyByIdFallBack",threadPoolProperties = {
            @HystrixProperty(name="coreSize",value = "20")
    })
    public String getMovieNameById(Integer id){
        String url = "http://movie-service-provider/movie/{1}";
        return restTemplate.getForObject(url,String.class,1);
    }

    public String getMoveNyByIdFallBack(Integer id){
        return "null";
    }
}
