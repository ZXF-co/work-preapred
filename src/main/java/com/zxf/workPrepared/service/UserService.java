package com.zxf.workPrepared.service;

import com.zxf.workPrepared.entity.User;
import com.zxf.workPrepared.model.dto.UserQueryDto;
import com.zxf.workPrepared.tools.SharedQuery;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * User服务
 *
 * @author zhouxiaofa
 * @date 2022/9/20 17:14
 */
public interface UserService {

    /**
     * 查询user信息
     *
     * @param       userId-->待查询user编号
     * @return      查询到的user信息
     */
    User findUser(String userId);

    /**
     * 创建user
     *
     * @param       user-->待创建user
     * @return      创建的user信息
     */
    void insertUser(User user);

    /**
     * 查询user列表
     *
     * @return      查询到的user列表
     */
    List<User> findAllUsers();

    /**
     * 更新user信息
     *
     * @param       user-->待更新user信息
     */
    void updateUser(User user);

    /**
     * 查询user列表
     *
     * @param       userQueryDto-->user查询条件
     * @return      查询到的user列表
     */
    List<User> selectUsers(UserQueryDto userQueryDto);

    /**
     * 添加user和post关联关系
     *
     * @param       sharedQuery-->公共查询条件
     */
    void addPost(SharedQuery sharedQuery);

    /**
     * 导出user表数据
     *
     * @return      导出的user表数据
     */
    String toExcel();
}
