package com.zxf.workPrepared.controller.impl;

import com.zxf.workPrepared.controller.UserController;
import com.zxf.workPrepared.entity.LoginUser;
import com.zxf.workPrepared.entity.User;
import com.zxf.workPrepared.model.dto.UserQueryDto;
import com.zxf.workPrepared.service.LoginUserService;
import com.zxf.workPrepared.service.TokenService;
import com.zxf.workPrepared.tools.SharedAnnotation;
import com.zxf.workPrepared.tools.SharedQuery;
import com.zxf.workPrepared.service.UserService;
import com.zxf.workPrepared.tools.WrapMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User接口实现
 *
 * @author zhouxiaofa
 * @date 2022/9/22 10:03
 */
@RestController
public class UserControllerImpl implements UserController {

    @Resource
    private UserService userService;
    @Resource
    private LoginUserService loginUserService;
    @Resource
    private TokenService tokenService;

    @Override
    public WrapMapper find(String id) {
        return WrapMapper.ok(userService.findUser(id));
    }

    @Override
    public WrapMapper insert(User user) {
        userService.insertUser(user);
        return WrapMapper.ok();
    }

    @Override
    public WrapMapper update(String id, User user) {
        User queryUser = userService.findUser(id);
        if(null == queryUser) {
            return WrapMapper.error(404);
        }
        user.setId(id);
        userService.updateUser(user);
        return WrapMapper.ok();
    }

    @SharedAnnotation.LoginToken
    @Override
    public WrapMapper<List<User>> findAll() {
        return WrapMapper.ok(userService.findAllUsers());
    }

    @Override
    public WrapMapper<List<User>> selectAll(UserQueryDto userQueryDto) {
        return WrapMapper.ok(userService.selectUsers(userQueryDto));
    }

    @Override
    public WrapMapper addPostRel(SharedQuery sharedQuery) {
        userService.addPost(sharedQuery);
        return WrapMapper.ok();
    }

    @Override
    public WrapMapper<Map> getToken(LoginUser loginUser) {
        Map<Object, Object> map = new HashMap<>();
        LoginUser queryLoginUser = loginUserService.findById(loginUser.getId());
        if(null == queryLoginUser) {
            map.put("message", "用户不存在!");
            return WrapMapper.ok(map);
        } else {
            if(!queryLoginUser.getPassword().equals(loginUser.getPassword())) {
                map.put("message", "密码错误!");
                return WrapMapper.ok(map);
            } else {
                String token = tokenService.getToken(queryLoginUser);
                map.put("token", token);
                map.put("loginUser", queryLoginUser);
                return WrapMapper.ok(map);
            }
        }
    }

    @SharedAnnotation.LoginToken
    @Override
    public WrapMapper test() {
        return WrapMapper.ok("成功获取到Token");
    }

    @Override
    public WrapMapper<String> toExcel() {
        return WrapMapper.ok(userService.toExcel());
    }
}
