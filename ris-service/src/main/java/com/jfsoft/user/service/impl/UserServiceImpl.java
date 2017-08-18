package com.jfsoft.user.service.impl;

import com.jfsoft.mapper.SysUserMapper;
import com.jfsoft.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * wanggang
 * 2017-08-11 8:58
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

}
