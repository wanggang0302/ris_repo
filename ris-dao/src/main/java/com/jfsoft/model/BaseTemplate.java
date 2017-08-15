/**
 * BaseTemplate.java
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
public class BaseTemplate {

    /**
     * GUID
     */
    private Object id;

    /**
     * 模板类别
     */
    private Object name;

    /**
     * 模板code
     */
    private BigDecimal code;

    /**
     * 拼音码
     */
    private Object pycode;

    /**
     * 个人或者公用模板
     */
    private Object type;

    /**
     * 模板对应人的id
     */
    private Object pertemplateid;

    /**
     * 危急值
     */
    private Object urgentvalue;

    /**
     * 阴性或者阳性体征
     */
    private Object polarity;

    /**
     * 正常模板或者异常模板
     */
    private Object pathology;

    /**
     * 建议
     */
    private Object suggest;

    /**
     * 适用性别(0:不限,1:男,2:女)
     */
    private Object adaptsex;

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

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public BigDecimal getCode() {
        return code;
    }

    public void setCode(BigDecimal code) {
        this.code = code;
    }

    public Object getPycode() {
        return pycode;
    }

    public void setPycode(Object pycode) {
        this.pycode = pycode;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getPertemplateid() {
        return pertemplateid;
    }

    public void setPertemplateid(Object pertemplateid) {
        this.pertemplateid = pertemplateid;
    }

    public Object getUrgentvalue() {
        return urgentvalue;
    }

    public void setUrgentvalue(Object urgentvalue) {
        this.urgentvalue = urgentvalue;
    }

    public Object getPolarity() {
        return polarity;
    }

    public void setPolarity(Object polarity) {
        this.polarity = polarity;
    }

    public Object getPathology() {
        return pathology;
    }

    public void setPathology(Object pathology) {
        this.pathology = pathology;
    }

    public Object getSuggest() {
        return suggest;
    }

    public void setSuggest(Object suggest) {
        this.suggest = suggest;
    }

    public Object getAdaptsex() {
        return adaptsex;
    }

    public void setAdaptsex(Object adaptsex) {
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
