package com.zxf.workPrepared.tools;

import java.util.ArrayList;
import java.util.List;

/**
 * 通用返回类
 *
 * @author zhouxiaofa
 * @date 2022/9/21 17:05
 */
public class WrapMapper<E> {

    /**
     * 返回状态码
     */
    private int code;
    /**
     * 返回信息
     */
    private String message;
    /**
     * 返回数据
     */
    private E data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public WrapMapper(int code, String message, E data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <E> WrapMapper<E> ok(E data){
        return new WrapMapper(200, "操作成功", data);

    }

    public static <E> WrapMapper<E> ok() {
        List<E> noData = new ArrayList<>();
        return new WrapMapper(200, "操作成功", noData);
    }

    public static <E> WrapMapper<E> error(int code) {
        List<E> noData = new ArrayList<>();
        switch (code) {
            case 404:
                return new WrapMapper(code, "Not found!", noData);
            case 500:
                return new WrapMapper(code, "Internal Server Error", noData);
            default:
                return new WrapMapper(code, "Error", noData);
        }
    }
}
