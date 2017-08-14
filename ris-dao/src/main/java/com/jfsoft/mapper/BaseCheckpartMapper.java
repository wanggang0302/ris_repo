/**
 * BaseCheckpartMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-11 Created
 */
package com.jfsoft.mapper;

import com.jfsoft.model.BaseCheckpart;

public interface BaseCheckpartMapper {

    int deleteByPrimaryKey(String id);

    int insert(BaseCheckpart record);

    int insertSelective(BaseCheckpart record);

    BaseCheckpart selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BaseCheckpart record);

}