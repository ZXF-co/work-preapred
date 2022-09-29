package com.zxf.workPrepared.service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.zxf.workPrepared.entity.LoginUser;
import com.zxf.workPrepared.service.TokenService;
import org.springframework.stereotype.Service;

/**
 * Token服务实现类
 *
 * @author zhouxiaofa
 * @date 2022/9/27 17:22
 */
@Service
public class TokenServiceImpl implements TokenService {

    @Override
    public String getToken(LoginUser loginUser) {
        String token = JWT.create().withAudience(loginUser.getId())
                .sign(Algorithm.HMAC256(loginUser.getPassword()));
        return token;
    }
}
