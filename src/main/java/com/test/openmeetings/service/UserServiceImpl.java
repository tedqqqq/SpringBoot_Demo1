package com.test.openmeetings.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.openmeetings.mapper.UserMapper;
import com.test.openmeetings.pojo.User;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @SuppressWarnings("all")
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list();
    }

 
}
