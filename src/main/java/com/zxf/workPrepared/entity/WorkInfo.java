package com.zxf.workPrepared.entity;

import com.zxf.workPrepared.enumeration.UserEnum;

/**
 * 工作信息
 *
 * @author zhouxiaofa
 * @date 2022/9/26 22:56
 */
public class WorkInfo extends AbstractEntity {

    /**
     * 编号
     */
    private String id;
    /**
     * user编号
     */
    private String userId;
    /**
     * 工作公司
     */
    private String company;
    /**
     * 工作年限
     */
    private int years;
    /**
     * 工作岗位
     */
    private String position;
    /**
     * 工作内容
     */
    private String content;
    /**
     * 描述
     */
    private String description;
    /**
     * 状态
     */
    private UserEnum.StateValue state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserEnum.StateValue getState() {
        return state;
    }

    public void setState(UserEnum.StateValue state) {
        this.state = state;
    }
}
