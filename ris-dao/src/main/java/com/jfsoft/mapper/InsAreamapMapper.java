/**
 * InsAreamapMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-18 Created
 */
package com.jfsoft.mapper;

import com.jfsoft.model.InsAreamap;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InsAreamapMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INS_AREAMAP
     */
    int insert(InsAreamap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INS_AREAMAP
     */
    int insertSelective(InsAreamap record);

}