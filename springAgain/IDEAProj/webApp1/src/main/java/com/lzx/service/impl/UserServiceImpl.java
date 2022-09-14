package com.lzx.service.impl;

import com.lzx.dao.UserDao;
import com.lzx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void save() {
        userDao.save();
    }
}
