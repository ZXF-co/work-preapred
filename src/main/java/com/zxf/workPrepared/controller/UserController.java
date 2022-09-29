package com.zxf.workPrepared.controller;

import com.zxf.workPrepared.entity.LoginUser;
import com.zxf.workPrepared.entity.User;
import com.zxf.workPrepared.model.dto.UserQueryDto;
import com.zxf.workPrepared.tools.SharedAnnotation;
import com.zxf.workPrepared.tools.SharedQuery;
import com.zxf.workPrepared.tools.WrapMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * User接口
 *
 * @author zhouxiaofa
 * @date 2022/9/20 17:11
 */
@Api("User模块接口API")
@RequestMapping(value = "/v1/user")
public interface UserController {

    /**
     * 根据ID查询user信息
     *
     * @param       id-->user编号
     * @return      查询到的user信息
     */
    @ApiOperation("通过ID查询user信息")
    @GetMapping(value = "/user/{id}")
    WrapMapper find(@PathVariable String id);

    /**
     * 创建user信息
     *
     * @param       user-->待创建user
     * @return      创建成功信息
     */
    @ApiOperation("创建user信息")
    @PostMapping(value = "/user")
    WrapMapper insert(@RequestBody User user);

    /**
     * 更新user信息
     *
     * @param       id-->待更新user编号
     * @param       user-->待更新user信息
     * @return      更新成功信息
     */
    @ApiOperation("通过ID更新user信息")
    @PutMapping(value = "/user/{id}")
    WrapMapper update(@PathVariable String id, @RequestBody User user);

    /**
     * 查询user列表
     *
     * @return      查询到的user列表
     */
    @ApiOperation("查询user列表")
    @GetMapping(value = "/user")
    WrapMapper<List<User>> findAll();

    /**
     * 查询user列表
     *
     * @param       userQueryDto-->user查询条件
     * @return      查询到的user列表
     */
    @ApiOperation("条件查询user列表")
    @GetMapping(value = "/users")
    WrapMapper<List<User>> selectAll(UserQueryDto userQueryDto);

    /**
     * 查询user列表
     *
     * @param       sharedQuery-->共用查询条件
     * @return      查询到的user列表
     */
    @ApiOperation("条件查询user列表")
    @PostMapping(value = "/users/post")
    WrapMapper addPostRel(@RequestBody SharedQuery sharedQuery);

    /**
     * 获取用户Token
     *
     * @param       loginUser-->登录用户
     * @return      获取到的token信息
     */
    @ApiOperation("获取Token")
    @PostMapping(value = "/getToken")
    WrapMapper<Map> getToken(LoginUser loginUser);


    /**
     * 测试获取Token是否生效
     *
     * @return      生效成功信息
     */
    @ApiOperation("测试获取Token是否生效")
    @GetMapping(value = "/test")
    WrapMapper test();

    /**
     * user信息导出到Excel表
     *
     * @return      导出的Excel表
     */
    @ApiOperation("导出数据到excel表")
    @GetMapping(value = "/toExcel")
    WrapMapper<String> toExcel();
}
