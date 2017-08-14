/**
 * BaseCheckpart.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-11 Created
 */
package com.jfsoft.model;

import java.util.Date;

/**
 * 检查部位维护
 * 
 * @author wanggang
 * @version 1.0 2017-08-11
 */
public class BaseCheckpart {

    /**
     * 编号
     */
    private String id;

    /**
     * 部位编号
     */
    private Integer code;

    /**
     * 部位名称
     */
    private String name;

    /**
     * 拼音码
     */
    private String pycode;

    /**
     * 适用性别(0:不限,1:男,2:女)
     */
    private String adaptSex;

    /**
     * 是否使用(0:否,1:是)
     */
    private String isUse;

    /**
     * 创建人code
     */
    private Integer createCode;

    /**
     * 创建时间
     * 默认：CURRENT_TIMESTAMP
     */
    private Date createTime;

    /**
     * 修改人code
     */
    private Integer modifyCode;

    /**
     * 修改时间
     * 默认：0000-00-00 00:00:00
     */
    private Date modifyTime;

    /**
     * 排序号
     */
    private Integer sortNum;

    /**
     * 备注
     */
    private String memo;

    /**
     * 所属区域
     */
    private String areacode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPycode() {
        return pycode;
    }

    public void setPycode(String pycode) {
        this.pycode = pycode == null ? null : pycode.trim();
    }

    public String getAdaptSex() {
        return adaptSex;
    }

    public void setAdaptSex(String adaptSex) {
        this.adaptSex = adaptSex == null ? null : adaptSex.trim();
    }

    public String getIsUse() {
        return isUse;
    }

    public void setIsUse(String isUse) {
        this.isUse = isUse == null ? null : isUse.trim();
    }

    public Integer getCreateCode() {
        return createCode;
    }

    public void setCreateCode(Integer createCode) {
        this.createCode = createCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getModifyCode() {
        return modifyCode;
    }

    public void setModifyCode(Integer modifyCode) {
        this.modifyCode = modifyCode;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }

}
