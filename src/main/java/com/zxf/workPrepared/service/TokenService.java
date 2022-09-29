package com.zxf.workPrepared.service;

import com.zxf.workPrepared.entity.LoginUser;

/**
 * Token服务类
 *
 * @author zhouxiaofa
 * @date 2022/9/27 17:21
 */
public interface TokenService {

    /**
     * 获取token
     *
     * @param       loginUser-->登录账号
     * @return      获取到的token
     */
    public String getToken(LoginUser loginUser);
}
