/**
 * BaseGroupitem.java
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
public class BaseGroupitem {

    /**
     * GUID
     */
    private String id;

    /**
     * 收费项目编号
     */
    private BigDecimal code;

    /**
     * 收费项目名称
     */
    private String name;

    /**
     * 设备类型code
     */
    private BigDecimal typecode;

    /**
     * 检查方法code
     */
    private String methodcode;

    /**
     * 收费项目拼音码
     */
    private String pycode;

    /**
     * 适用性别(0:不限,1:男,2:女)
     */
    private String adaptsex;

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
    private String memo;

    /**
     * 所属区域号
     */
    private String areacode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getCode() {
        return code;
    }

    public void setCode(BigDecimal code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getTypecode() {
        return typecode;
    }

    public void setTypecode(BigDecimal typecode) {
        this.typecode = typecode;
    }

    public String getMethodcode() {
        return methodcode;
    }

    public void setMethodcode(String methodcode) {
        this.methodcode = methodcode;
    }

    public String getPycode() {
        return pycode;
    }

    public void setPycode(String pycode) {
        this.pycode = pycode;
    }

    public String getAdaptsex() {
        return adaptsex;
    }

    public void setAdaptsex(String adaptsex) {
        this.adaptsex = adaptsex;
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

}
