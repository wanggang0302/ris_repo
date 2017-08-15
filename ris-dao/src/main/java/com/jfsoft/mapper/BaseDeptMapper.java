/**
 * BaseDeptMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-15 Created
 */
package com.jfsoft.mapper;

import com.jfsoft.model.BaseDept;

public interface BaseDeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_DEPT
     */
    int deleteByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_DEPT
     */
    int insert(BaseDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_DEPT
     */
    int insertSelective(BaseDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_DEPT
     */
    BaseDept selectByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_DEPT
     */
    int updateByPrimaryKeySelective(BaseDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_DEPT
     */
    int updateByPrimaryKey(BaseDept record);
}