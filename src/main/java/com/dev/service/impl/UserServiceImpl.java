package com.dev.service.impl;

import com.dev.dao.UserMapper;
import com.dev.model.User;
import com.dev.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectUserById(int id) throws Exception {
        return userMapper.selectByPrimaryKey(id);
    }
}
