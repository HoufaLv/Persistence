package com.lv.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "movie-service-provider",fallback = MovieServiceClientFallBack.class)
public interface MovieServiceClient {

    /**
     * 发起get请求，不是MVC,name 必须指定
     * @param id
     * @return
     */
    @GetMapping("/movie/{id}")
    String getMovieName(@PathVariable(name = "id") Integer id);

}
