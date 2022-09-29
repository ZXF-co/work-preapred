package com.zxf.workPrepared.tools;

import com.zxf.workPrepared.entity.AbstractEntity;

import java.util.List;

/**
 * 共用查询
 *
 * @author zhouxiaofa
 * @date 2022/9/27 16:41
 */
public class SharedQuery extends AbstractEntity {

    /**
     * 查询ID
     */
    private String queryId;
    /**
     * 查询列表
     */
    private List<String> queryList;

    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public List<String> getQueryList() {
        return queryList;
    }

    public void setQueryList(List<String> queryList) {
        this.queryList = queryList;
    }
}
