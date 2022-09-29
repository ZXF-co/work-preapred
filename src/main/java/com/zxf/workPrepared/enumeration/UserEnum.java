package com.zxf.workPrepared.enumeration;

/**
 * @author zhouxiaofa
 * @date 2022/9/22 9:26
 */
public class UserEnum {

    public enum StateValue {
        U("可用"),
        E("不可用");
        private String cnName;

        StateValue(String cnName) {
            this.cnName = cnName;
        }

        public String getCnName() {
            return cnName;
        }

        public void setCnName(String cnName) {
            this.cnName = cnName;
        }
    }

    public enum PostLevelValue {
        PRIMARY("初级"),
        MIDDLE("中级"),
        SENIOR("高级"),
        EXPERT("专家");
        private String cnName;

        PostLevelValue(String cnName) {
            this.cnName = cnName;
        }

        public String getCnName() {
            return cnName;
        }

        public void setCnName(String cnName) {
            this.cnName = cnName;
        }
    }


}
