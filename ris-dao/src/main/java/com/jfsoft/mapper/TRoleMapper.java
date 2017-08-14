/**
 * TRoleMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-10 Created
 */
package com.jfsoft.mapper;

import com.jfsoft.model.Role;
import com.jfsoft.model.TPermission;

import java.util.List;

public interface TRoleMapper {

    int insert(Role record);

    int insertSelective(Role record);

    /**
     * 根据角色查询权限
     * @param roleId
     * @return
     */
    List<TPermission> getPermissions(String roleId);

}
