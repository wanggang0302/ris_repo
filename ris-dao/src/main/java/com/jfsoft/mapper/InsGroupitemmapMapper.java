/**
 * InsGroupitemmapMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-15 Created
 */
package com.jfsoft.mapper;

import com.jfsoft.model.InsGroupitemmap;

public interface InsGroupitemmapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INS_GROUPITEMMAP
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INS_GROUPITEMMAP
     */
    int insert(InsGroupitemmap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INS_GROUPITEMMAP
     */
    int insertSelective(InsGroupitemmap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INS_GROUPITEMMAP
     */
    InsGroupitemmap selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INS_GROUPITEMMAP
     */
    int updateByPrimaryKeySelective(InsGroupitemmap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INS_GROUPITEMMAP
     */
    int updateByPrimaryKey(InsGroupitemmap record);
}