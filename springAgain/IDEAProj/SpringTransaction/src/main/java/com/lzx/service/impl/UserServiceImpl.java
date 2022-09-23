package com.lzx.service.impl;

import com.lzx.dao.UserDao;
import com.lzx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional()
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void transfer(String username1, String username2, int money) {
        userDao.decreaseUserMoney(username1, money);
        int i = 1 / 0;
        userDao.addUserMoney(username2,money);
    }
}
