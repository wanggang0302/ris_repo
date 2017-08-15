/**
 * BaseArea.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-15 Created
 */
package com.jfsoft.model;

import java.math.BigDecimal;

/**
 * null
 * 
 * @author wanggang
 * @version 1.0 2017-08-15
 */
public class BaseArea {

    /**
     * GUID
     */
    private Object id;

    /**
     * 区域编号
     */
    private Object code;

    /**
     * 区域名称
     */
    private Object name;

    /**
     * 区域拼音码
     */
    private Object pycode;

    /**
     * 排序号
     */
    private BigDecimal sortnum;

    /**
     * 备注
     */
    private Object memo;

    /**
     * 外部数据标识
     */
    private Object hiscode;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getPycode() {
        return pycode;
    }

    public void setPycode(Object pycode) {
        this.pycode = pycode;
    }

    public BigDecimal getSortnum() {
        return sortnum;
    }

    public void setSortnum(BigDecimal sortnum) {
        this.sortnum = sortnum;
    }

    public Object getMemo() {
        return memo;
    }

    public void setMemo(Object memo) {
        this.memo = memo;
    }

    public Object getHiscode() {
        return hiscode;
    }

    public void setHiscode(Object hiscode) {
        this.hiscode = hiscode;
    }

}
