/**
 * BaseIllnessMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-15 Created
 */
package com.jfsoft.mapper;

import com.jfsoft.model.BaseIllness;

public interface BaseIllnessMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_ILLNESS
     */
    int deleteByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_ILLNESS
     */
    int insert(BaseIllness record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_ILLNESS
     */
    int insertSelective(BaseIllness record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_ILLNESS
     */
    BaseIllness selectByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_ILLNESS
     */
    int updateByPrimaryKeySelective(BaseIllness record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_ILLNESS
     */
    int updateByPrimaryKey(BaseIllness record);
}