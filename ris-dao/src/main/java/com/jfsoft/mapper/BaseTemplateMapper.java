/**
 * BaseTemplateMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-15 Created
 */
package com.jfsoft.mapper;

import com.jfsoft.model.BaseTemplate;

public interface BaseTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_TEMPLATE
     */
    int deleteByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_TEMPLATE
     */
    int insert(BaseTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_TEMPLATE
     */
    int insertSelective(BaseTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_TEMPLATE
     */
    BaseTemplate selectByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_TEMPLATE
     */
    int updateByPrimaryKeySelective(BaseTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_TEMPLATE
     */
    int updateByPrimaryKey(BaseTemplate record);
}