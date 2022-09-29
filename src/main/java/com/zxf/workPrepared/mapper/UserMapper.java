package com.zxf.workPrepared.mapper;

import com.zxf.workPrepared.entity.User;
import com.zxf.workPrepared.tools.SharedQuery;
import com.zxf.workPrepared.query.impl.UserQueryImpl;

import java.util.List;

/**
 * UserMapper
 * @author zhouxiaofa
 * @date 2022/9/20 16:56
 */
public interface UserMapper {

    /**
     * 查询user信息
     *
     * @param       userId-->待查询user编号
     * @return      查询到的user信息
     */
    User find(String userId);

    /**
     * 创建user信息
     *
     * @param       user-->待创建user信息
     * @return      创建的user信息
     */
    void insert(User user);

    /**
     * 查询user列表
     *
     * @return      查询到的user列表
     */
    List<User> findAll();

    /**
     * 更新user信息
     *
     * @param       user-->待更新user信息
     */
    void update(User user);

    /**
     * 条件查询user列表
     *
     * @param       userQuery-->user查询条件
     * @return      根据查询条件得到的user列表
     */
    List<User> selectUser(UserQueryImpl userQuery);

    /**
     * 更新user信息
     *
     * @param       sharedQuery-->共用查询条件
     */
    void addPost(SharedQuery sharedQuery);
}
