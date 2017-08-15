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
    private String id;

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
    private String name;

    /**
     * 账号(登录名)
     */
    private String username;

    /**
     * 密码(MD5加密)
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

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
    private String memo;

    /**
     * 区域编码
     */
    private String areacode;

    /**
     * 是否使用
     */
    private String isuse;

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

    public BigDecimal getEntrycode() {
        return entrycode;
    }

    public void setEntrycode(BigDecimal entrycode) {
        this.entrycode = entrycode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
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

    public String getIsuse() {
        return isuse;
    }

    public void setIsuse(String isuse) {
        this.isuse = isuse;
    }

    public BigDecimal getActorcode() {
        return actorcode;
    }

    public void setActorcode(BigDecimal actorcode) {
        this.actorcode = actorcode;
    }

}
