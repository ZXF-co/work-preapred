package com.zxf.workPrepared.entity;

import com.zxf.workPrepared.enumeration.UserEnum;

/**
 * 职务信息
 *
 * @author zhouxiaofa
 * @date 2022/9/27 16:16
 */
public class Post extends AbstractEntity{

    /**
     * user编号
     */
    private String id;
    /**
     * 名称
     */
    private String name;
    /**
     * 状态
     */
    private String state;
    /**
     * 描述
     */
    private String description;
    /**
     * 职级
     */
    private UserEnum.PostLevelValue postLevel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserEnum.PostLevelValue getPostLevel() {
        return postLevel;
    }

    public void setPostLevel(UserEnum.PostLevelValue postLevel) {
        this.postLevel = postLevel;
    }
}
