package com.lv.service;

import com.lv.entity.Token;

public interface TokenService {

    /**
     * 根据输入的token 判断能不能访问具体页面
     * @param token
     */
    void verifyToken(Token token);
}
