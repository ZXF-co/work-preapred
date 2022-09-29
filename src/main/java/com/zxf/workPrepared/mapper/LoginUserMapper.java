package com.zxf.workPrepared.mapper;

import com.zxf.workPrepared.entity.LoginUser;

/**
 * @author zhouxiaofa
 * @date 2022/9/27 22:42
 */
public interface LoginUserMapper {

    /**
     * 通过账号查询登录用户
     *
     * @param       id-->登录账号
     * @return      查询到的登录账户信息
     */
    LoginUser findById(String id);
}
