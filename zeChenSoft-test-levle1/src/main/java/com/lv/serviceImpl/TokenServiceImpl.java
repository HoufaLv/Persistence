package com.lv.serviceImpl;

import com.lv.entity.Token;
import com.lv.entity.TokenExample;
import com.lv.exception.ServiceException;
import com.lv.mapper.TokenMapper;
import com.lv.service.TokenService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenMapper tokenMapper;

    /**
     * 根据输入的token 判断能不能访问具体页面
     *
     * @param token
     */
    @Override
    public void verifyToken(Token token) {

        //md5 HEX
        token.setToken(DigestUtils.md5Hex(token.getToken()));

        TokenExample tokenExample = new TokenExample();
        List<Token> tokens = tokenMapper.selectByExample(tokenExample);

        if (!tokens.get(0).getToken().equals(token.getToken())){
            throw new ServiceException("token 不正确");
        }
    }
}
