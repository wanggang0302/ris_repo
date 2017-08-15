/**
 * SysLog.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-15 Created
 */
package com.jfsoft.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * null
 * 
 * @author wanggang
 * @version 1.0 2017-08-15
 */
public class SysLog {

    /**
     * GUID
     */
    private Object id;

    /**
     * 日志类型
     */
    private Object logLevel;

    /**
     * 关联Sys_User的Code
     */
    private BigDecimal usercode;

    /**
     * 日志内容
     */
    private Object message;

    /**
     * 创建日期
     */
    private Date logdate;

    /**
     * 模块
     */
    private Object module;

    /**
     * 报错信息
     */
    private String exception;

    /**
     * 所属区域号
     */
    private Object areacode;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(Object logLevel) {
        this.logLevel = logLevel;
    }

    public BigDecimal getUsercode() {
        return usercode;
    }

    public void setUsercode(BigDecimal usercode) {
        this.usercode = usercode;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public Date getLogdate() {
        return logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    public Object getModule() {
        return module;
    }

    public void setModule(Object module) {
        this.module = module;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception == null ? null : exception.trim();
    }

    public Object getAreacode() {
        return areacode;
    }

    public void setAreacode(Object areacode) {
        this.areacode = areacode;
    }

}
