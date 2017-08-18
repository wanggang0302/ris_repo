/**
 * BaseEquipment.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-18 Created
 */
package com.jfsoft.model;

import java.math.BigDecimal;

/**
 * null
 * 
 * @author wanggang
 * @version 1.0 2017-08-18
 */
public class BaseEquipment {

    /**
     * GUID
     */
    private String id;

    /**
     * 设备编号
     */
    private BigDecimal code;

    /**
     * 设备名称
     */
    private String name;

    /**
     * 所属设备类型编码
     */
    private BigDecimal typecode;

    /**
     * 所属科室编码
     */
    private BigDecimal deptcode;

    /**
     * 拼音码
     */
    private String pycode;

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

    public BigDecimal getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(BigDecimal deptcode) {
        this.deptcode = deptcode;
    }

    public String getPycode() {
        return pycode;
    }

    public void setPycode(String pycode) {
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
