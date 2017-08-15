/**
 * BaseCheckroomMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-15 Created
 */
package com.jfsoft.mapper;

import com.jfsoft.model.BaseCheckroom;

public interface BaseCheckroomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_CHECKROOM
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_CHECKROOM
     */
    int insert(BaseCheckroom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_CHECKROOM
     */
    int insertSelective(BaseCheckroom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_CHECKROOM
     */
    BaseCheckroom selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_CHECKROOM
     */
    int updateByPrimaryKeySelective(BaseCheckroom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_CHECKROOM
     */
    int updateByPrimaryKey(BaseCheckroom record);
}