package com.lzm.service.impl;

import com.lzm.dao.UserDao;
import com.lzm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void transfer(int idFrom, int idTo, int money) {
        userDao.changeOut(idFrom, money);
        int i = 1 / 0;
        userDao.changeIn(idTo, money);
    }
}
