/**
 * BaseTempillmapMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-15 Created
 */
package com.jfsoft.mapper;

import com.jfsoft.model.BaseTempillmap;

public interface BaseTempillmapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_TEMPILLMAP
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_TEMPILLMAP
     */
    int insert(BaseTempillmap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_TEMPILLMAP
     */
    int insertSelective(BaseTempillmap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_TEMPILLMAP
     */
    BaseTempillmap selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_TEMPILLMAP
     */
    int updateByPrimaryKeySelective(BaseTempillmap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_TEMPILLMAP
     */
    int updateByPrimaryKey(BaseTempillmap record);
}