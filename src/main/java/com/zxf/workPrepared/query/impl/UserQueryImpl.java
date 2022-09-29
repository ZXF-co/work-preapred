package com.zxf.workPrepared.query.impl;

import com.zxf.workPrepared.query.UserQuery;

/**
 * user条件查询
 *
 * @author zhouxiaofa
 * @date 2022/9/26 23:18
 */
public class UserQueryImpl implements UserQuery {

    /**
     * 编号
     */
    private String id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 电话号码
     */
    private String phone;
    /**
     * 性别
     */
    private String gender;
    /**
     * 是否查询教育信息
     */
    private Boolean withEduInfo;
    /**
     * 是否查询工作信息
     */
    private Boolean withWorkInfo;

    @Override
    public UserQueryImpl id(String id) {
        this.id = id;
        return this;
    }

    @Override
    public UserQueryImpl name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public UserQueryImpl phone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public UserQueryImpl gender(String gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public UserQueryImpl withEduInfo() {
        this.withEduInfo = true;
        return this;
    }

    @Override
    public UserQueryImpl withWorkInfo() {
        this.withWorkInfo = true;
        return this;
    }
}
