/**
 * BaseEquipmentMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-15 Created
 */
package com.jfsoft.mapper;

import com.jfsoft.model.BaseEquipment;

public interface BaseEquipmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_EQUIPMENT
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_EQUIPMENT
     */
    int insert(BaseEquipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_EQUIPMENT
     */
    int insertSelective(BaseEquipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_EQUIPMENT
     */
    BaseEquipment selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_EQUIPMENT
     */
    int updateByPrimaryKeySelective(BaseEquipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_EQUIPMENT
     */
    int updateByPrimaryKey(BaseEquipment record);
}