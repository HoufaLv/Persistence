package com.lv.client;

import org.springframework.stereotype.Component;

/**
 * Hystrix + fegin
 */
@Component
public class MovieServiceClientFallBack implements MovieServiceClient {

    @Override
    public String getMovieName(Integer id) {
        return "GG";
    }
}
