package com.zxf.workPrepared.entity;

import com.zxf.workPrepared.enumeration.UserEnum;

import java.util.List;

/**
 * User信息
 *
 * @author zhouxiaofa
 * @date 2022/9/20 16:49
 */
public class User extends AbstractEntity{

    /**
     * user编号
     */
    private String id;
    /**
     * user姓名
     */
    private String name;
    /**
     * user性别
     */
    private String gender;
    /**
     * user年龄
     */
    private int age;
    /**
     * user电话
     */
    private String phone;
    /**
     * 描述
     */
    private String description;
    /**
     * 是否可用状态
     */
    private UserEnum.StateValue state;
    /**
     * 教育信息
     */
    private EduInfo eduInfo;
    /**
     * 工作信息
     */
    private List<WorkInfo> workInfoList;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public EduInfo getEduInfo() {
        return eduInfo;
    }

    public void setEduInfo(EduInfo eduInfo) {
        this.eduInfo = eduInfo;
    }

    public List<WorkInfo> getWorkInfoList() {
        return workInfoList;
    }

    public void setWorkInfoList(List<WorkInfo> workInfoList) {
        this.workInfoList = workInfoList;
    }
}
