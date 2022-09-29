package com.zxf.workPrepared.service.impl;

import com.zxf.workPrepared.entity.LoginUser;
import com.zxf.workPrepared.mapper.LoginUserMapper;
import com.zxf.workPrepared.service.LoginUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 登录用户服务实现
 *
 * @author zhouxiaofa
 * @date 2022/9/27 17:31
 */
@Service
public class LoginUserServiceImpl implements LoginUserService {

    @Resource
    private LoginUserMapper loginUserMapper;

    @Override
    public LoginUser findById(String id) {
        return loginUserMapper.findById(id);
    }
}
