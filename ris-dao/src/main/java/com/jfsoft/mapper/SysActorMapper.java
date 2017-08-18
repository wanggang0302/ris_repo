/**
 * SysActorMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-18 Created
 */
package com.jfsoft.mapper;

import com.jfsoft.model.SysActor;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysActorMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ACTOR
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ACTOR
     */
    int insert(SysActor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ACTOR
     */
    int insertSelective(SysActor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ACTOR
     */
    SysActor selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ACTOR
     */
    int updateByPrimaryKeySelective(SysActor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ACTOR
     */
    int updateByPrimaryKey(SysActor record);
}