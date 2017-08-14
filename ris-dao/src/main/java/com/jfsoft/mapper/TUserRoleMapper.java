/**
 * TUserRoleMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-10 Created
 */
package com.jfsoft.mapper;

import com.jfsoft.model.TUserRole;

public interface TUserRoleMapper {

    int insert(TUserRole record);

    int insertSelective(TUserRole record);

}
