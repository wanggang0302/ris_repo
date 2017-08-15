/**
 * SysActor.java
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
public class SysActor {

    /**
     * GUID主键
     */
    private Object id;

    /**
     * 编号(业务唯一)
     */
    private BigDecimal code;

    /**
     * 角色名称
     */
    private Object name;

    /**
     * 创建人code
     */
    private BigDecimal createcode;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 修改人code
     */
    private BigDecimal modifycode;

    /**
     * 修改时间
     */
    private Date modifytime;

    /**
     * 排序号
     */
    private BigDecimal sortnum;

    /**
     * 备注
     */
    private Object memo;

    /**
     * 区域编码
     */
    private Object areacode;

    /**
     */
    private Object isuse;

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

    public BigDecimal getCreatecode() {
        return createcode;
    }

    public void setCreatecode(BigDecimal createcode) {
        this.createcode = createcode;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getModifycode() {
        return modifycode;
    }

    public void setModifycode(BigDecimal modifycode) {
        this.modifycode = modifycode;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
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

    public Object getIsuse() {
        return isuse;
    }

    public void setIsuse(Object isuse) {
        this.isuse = isuse;
    }

}
