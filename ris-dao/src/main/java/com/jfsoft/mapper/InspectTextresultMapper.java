/**
 * InspectTextresultMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-15 Created
 */
package com.jfsoft.mapper;

import com.jfsoft.model.InspectTextresult;

public interface InspectTextresultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSPECT_TEXTRESULT
     */
    int deleteByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSPECT_TEXTRESULT
     */
    int insert(InspectTextresult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSPECT_TEXTRESULT
     */
    int insertSelective(InspectTextresult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSPECT_TEXTRESULT
     */
    InspectTextresult selectByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSPECT_TEXTRESULT
     */
    int updateByPrimaryKeySelective(InspectTextresult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSPECT_TEXTRESULT
     */
    int updateByPrimaryKey(InspectTextresult record);
}