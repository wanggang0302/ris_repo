/**
 * InspectPicresultMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-18 Created
 */
package com.jfsoft.mapper;

import com.jfsoft.model.InspectPicresult;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectPicresultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSPECT_PICRESULT
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSPECT_PICRESULT
     */
    int insert(InspectPicresult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSPECT_PICRESULT
     */
    int insertSelective(InspectPicresult record);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSPECT_PICRESULT
     */
    InspectPicresult selectByPrimaryKey(String id);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSPECT_PICRESULT
     */
    int updateByPrimaryKeySelective(InspectPicresult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSPECT_PICRESULT
     */
    int updateByPrimaryKey(InspectPicresult record);
}