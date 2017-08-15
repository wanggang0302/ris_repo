/**
 * BaseDept.java
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
public class BaseDept {

    /**
     * GUID
     */
    private String id;

    /**
     * 科室编号
     */
    private BigDecimal code;

    /**
     * 科室名称
     */
    private String name;

    /**
     * 科室类别
     */
    private String type;

    /**
     * 收费项目拼音码
     */
    private String pycode;

    /**
     * 适用性别(0:不限,1:男,2:女)
     */
    private String adaptSex;

    /**
     * 是否使用(0:否,1:是)
     */
    private Short isuse;

    /**
     * 设备类型code
     */
    private BigDecimal equipcode;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPycode() {
        return pycode;
    }

    public void setPycode(String pycode) {
        this.pycode = pycode;
    }

    public String getAdaptSex() {
        return adaptSex;
    }

    public void setAdaptSex(String adaptSex) {
        this.adaptSex = adaptSex;
    }

    public Short getIsuse() {
        return isuse;
    }

    public void setIsuse(Short isuse) {
        this.isuse = isuse;
    }

    public BigDecimal getEquipcode() {
        return equipcode;
    }

    public void setEquipcode(BigDecimal equipcode) {
        this.equipcode = equipcode;
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
