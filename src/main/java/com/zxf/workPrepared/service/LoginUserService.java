package com.zxf.workPrepared.service;

import com.zxf.workPrepared.entity.LoginUser;

/**
 * 登录用户服务
 *
 * @author zhouxiaofa
 * @date 2022/9/27 17:31
 */
public interface LoginUserService {

    /**
     * 通过id查询LoginUser
     *
     * @param       id-->编号
     * @return      查询到的loginUser
     */
    LoginUser findById(String id);
}
