package com.zxf.workPrepared.query;

/**
 * @author zhouxiaofa
 * @date 2022/9/26 23:46
 */
public interface UserQuery {

    UserQuery id(String id);

    UserQuery name(String name);

    UserQuery phone(String phone);

    UserQuery gender(String gender);

    UserQuery withEduInfo();

    UserQuery withWorkInfo();
}
