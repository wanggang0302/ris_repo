/**
 * SysUser.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-15 Created
 */
package com.jfsoft.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * null
 * 
 * @author wanggang
 * @version 1.0 2017-08-15
 */
public class SysUser {

    /**
     * 主键GUID
     */
    private Object id;

    /**
     * 编号(业务唯一)
     */
    private BigDecimal code;

    /**
     * 第三方用户code(登录名)
     */
    private BigDecimal entrycode;

    /**
     * 姓名
     */
    private Object name;

    /**
     * 账号(登录名)
     */
    private Object username;

    /**
     * 密码(MD5加密)
     */
    private Object password;

    /**
     * 邮箱
     */
    private Object email;

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
     * 是否使用
     */
    private Object isuse;

    /**
     * 角色code
     */
    private BigDecimal actorcode;

    /**
     * 用户所属角色对应的科室
     * wanggang
     * 2017年8月15日
     */
    public List<SysActordeptmap> deptList;

    public List<SysActordeptmap> getDeptList() {
        return deptList;
    }

    public void setDeptList(List<SysActordeptmap> deptList) {
        this.deptList = deptList;
    }

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

    public BigDecimal getEntrycode() {
        return entrycode;
    }

    public void setEntrycode(BigDecimal entrycode) {
        this.entrycode = entrycode;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getUsername() {
        return username;
    }

    public void setUsername(Object username) {
        this.username = username;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
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

    public BigDecimal getActorcode() {
        return actorcode;
    }

    public void setActorcode(BigDecimal actorcode) {
        this.actorcode = actorcode;
    }

}
