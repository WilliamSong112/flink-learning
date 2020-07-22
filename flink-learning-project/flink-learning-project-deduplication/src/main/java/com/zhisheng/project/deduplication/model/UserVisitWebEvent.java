package com.zhisheng.project.deduplication.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fanrui
 * @date 2019-11-01 01:24:50
 * @desc 用户访问网页的日志
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserVisitWebEvent {

    /**
     * 日志的唯一 id
     */
    private String id;

    /**
     * 日期，如：20191025
      */
    private String date;

    /**
     * 页面 id
      */
    private Integer pageId;

    /**
     *  用户的唯一标识，用户 id
      */
    private String userId;

    /**
     * 页面的 url
      */
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}