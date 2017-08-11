/**
 * TRole.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-10 Created
 */
package com.jfsoft.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * @author wanggang
 * @version 1.0 2017-08-10
 */
public class Role {

    /**
     */
    private Integer id;

    /**
     */
    private String rolename;

    //一个角色对应多个权限
    private List<TPermission> permissionList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public List<TPermission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<TPermission> permissionList) {
        this.permissionList = permissionList;
    }

    public List<String> getPermissionsName() {
        List<String> list = new ArrayList<String>();
        List<TPermission> perlist = getPermissionList();
        for (TPermission per : perlist) {
            list.add(per.getPermissionname());
        }
        return list;
    }

}
