package com.zxf.workPrepared.model.dto;

/**
 * user条件查询Dto
 *
 * @author zhouxiaofa
 * @date 2022/9/26 23:50
 */
public class UserQueryDto {

    /**
     * user编号
     */
    private String id;
    /**
     * user姓名
     */
    private String name;
    /**
     * user电话号码
     */
    private String phone;
    /**
     * user性别
     */
    private String gender;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
