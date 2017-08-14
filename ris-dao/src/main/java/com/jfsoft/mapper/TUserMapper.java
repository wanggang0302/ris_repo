/**
 * TUserMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-08-10 Created
 */
package com.jfsoft.mapper;

import com.jfsoft.model.User;

import java.util.List;
import java.util.Map;

public interface TUserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 根据登录账号查询用户
     * @param username
     * @return
     */
    User findByName(String username);

    /**
     * 分页查询用户
     * @param params
     * @return
     */
    List<User> findPage(Map<String, Object> params);

    /**
     * 查询用户总数
     * @param params
     * @return
     */
    int findPageCount(Map<String, Object> params);
    
}
