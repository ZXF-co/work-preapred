package com.zxf.workPrepared.tools;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解类
 *
 * @author zhouxiaofa
 * @date 2022/9/27 17:15
 */
public class SharedAnnotation {

    /**
     * 跳过token验证
     */
    @Target({ElementType.METHOD, ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface PassToken {
        boolean required() default true;
    }

    /**
     * 进行token验证
     */
    @Target({ElementType.METHOD, ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface LoginToken {
        boolean required() default true;
    }
}
