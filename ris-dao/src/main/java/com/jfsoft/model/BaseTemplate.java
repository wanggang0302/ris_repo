/**
 * BaseTemplate.java
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
public class BaseTemplate {

    /**
     * GUID
     */
    private String id;

    /**
     * 部位组code
     */
    private BigDecimal positioncode;

    /**
     * 模板code
     */
    private BigDecimal code;

    /**
     * 部位的code
     */
    private BigDecimal partcode;

    /**
     * 拼音码
     */
    private String pycode;

    /**
     * 个人或者公用模板
     */
    private String type;

    /**
     * 模板对应人的id
     */
    private String pertemplateid;

    /**
     * 危急值
     */
    private String urgentvalue;

    /**
     * 阴性或者阳性体征
     */
    private String polarity;

    /**
     * 正常模板或者异常模板
     */
    private String pathology;

    /**
     * 建议
     */
    private String suggest;

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

    public BigDecimal getPositioncode() {
        return positioncode;
    }

    public void setPositioncode(BigDecimal positioncode) {
        this.positioncode = positioncode;
    }

    public BigDecimal getCode() {
        return code;
    }

    public void setCode(BigDecimal code) {
        this.code = code;
    }

    public BigDecimal getPartcode() {
        return partcode;
    }

    public void setPartcode(BigDecimal partcode) {
        this.partcode = partcode;
    }

    public String getPycode() {
        return pycode;
    }

    public void setPycode(String pycode) {
        this.pycode = pycode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPertemplateid() {
        return pertemplateid;
    }

    public void setPertemplateid(String pertemplateid) {
        this.pertemplateid = pertemplateid;
    }

    public String getUrgentvalue() {
        return urgentvalue;
    }

    public void setUrgentvalue(String urgentvalue) {
        this.urgentvalue = urgentvalue;
    }

    public String getPolarity() {
        return polarity;
    }

    public void setPolarity(String polarity) {
        this.polarity = polarity;
    }

    public String getPathology() {
        return pathology;
    }

    public void setPathology(String pathology) {
        this.pathology = pathology;
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest;
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
