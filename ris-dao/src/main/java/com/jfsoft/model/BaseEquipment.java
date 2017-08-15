/**
 * BaseEquipment.java
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
public class BaseEquipment {

    /**
     * GUID
     */
    private Object id;

    /**
     * 类型编号
     */
    private BigDecimal code;

    /**
     * 类型名称
     */
    private Object name;

    /**
     * 拼音码
     */
    private Object pycode;

    /**
     * 是否使用(0:否,1:是)
     */
    private Short isuse;

    /**
     * 排序号
     */
    private BigDecimal sortnum;

    /**
     * 备注
     */
    private Object memo;

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

    public BigDecimal getCode() {
        return code;
    }

    public void setCode(BigDecimal code) {
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

    public Short getIsuse() {
        return isuse;
    }

    public void setIsuse(Short isuse) {
        this.isuse = isuse;
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

    public Object getAreacode() {
        return areacode;
    }

    public void setAreacode(Object areacode) {
        this.areacode = areacode;
    }

}
