/**
 * InspectPerinfoMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-15 Created
 */
package com.jfsoft.mapper;

import com.jfsoft.model.InspectPerinfo;

import java.util.List;

public interface InspectPerinfoMapper {
    
    int deleteByPrimaryKey(String id);

    int insert(InspectPerinfo record);

    int insertSelective(InspectPerinfo record);

    InspectPerinfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(InspectPerinfo record);

    int updateByPrimaryKey(InspectPerinfo record);
    List<InspectPerinfo> getPerinfoList();
    
}