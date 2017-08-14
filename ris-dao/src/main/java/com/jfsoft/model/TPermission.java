/**
 * TPermission.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-10 Created
 */
package com.jfsoft.model;

/**
 * 
 * 
 * @author wanggang
 * @version 1.0 2017-08-10
 */
public class TPermission {

    /**
     */
    private Integer id;

    /**
     */
    private String permissionname;

    /**
     */
    private Integer roleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname == null ? null : permissionname.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

}
