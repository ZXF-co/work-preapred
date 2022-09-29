package com.zxf.workPrepared.entity;

/**
 * User账号/密码类
 *
 * @author zhouxiaofa
 * @date 2022/9/27 17:25
 */
public class LoginUser extends AbstractEntity {

    /**
     * 账号
     */
    private String id;
    /**
     * 密码
     */
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
