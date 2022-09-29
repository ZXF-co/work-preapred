package com.zxf.workPrepared.entity;


import java.util.Date;

/**
 * 实体抽象类
 *
 * @author zhouxiaofa
 * @date 2022/9/21 16:01
 */
public abstract class AbstractEntity {

    private String createUserId="1";
    private String createUserName="框架测试账号";
    private Date createDate=new Date();
    private int revision=1;

    public AbstractEntity() {
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public int getRevisionNext() {
        return this.revision + 1;
    }
}
