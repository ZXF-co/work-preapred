package com.zxf.workPrepared.entity;

import com.zxf.workPrepared.enumeration.UserEnum;

/**
 * 教育信息
 *
 * @author zhouxiaofa
 * @date 2022/9/21 15:25
 */
public class EduInfo extends AbstractEntity{

    /**
     * 编号
     */
    private String id;
    /**
     * user编号
     */
    private String userId;
    /**
     * 学校名称
     */
    private String universityName;
    /**
     * 学校地址
     */
    private String universityAddress;
    /**
     * 学院名称
     */
    private String college;
    /**
     * 专业
     */
    private String major;
    /**
     * 学号
     */
    private String stuId;
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

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public UserEnum.StateValue getState() {
        return state;
    }

    public void setState(UserEnum.StateValue state) {
        this.state = state;
    }
}
