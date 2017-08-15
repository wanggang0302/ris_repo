/**
 * BaseGroupitemMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-15 Created
 */
package com.jfsoft.mapper;

import com.jfsoft.model.BaseGroupitem;

import java.util.List;

public interface BaseGroupitemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_GROUPITEM
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_GROUPITEM
     */
    int insert(BaseGroupitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_GROUPITEM
     */
    int insertSelective(BaseGroupitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_GROUPITEM
     */
    BaseGroupitem selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_GROUPITEM
     */
    int updateByPrimaryKeySelective(BaseGroupitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_GROUPITEM
     */
    int updateByPrimaryKey(BaseGroupitem record);

    List<BaseGroupitem> getGroupList();
}