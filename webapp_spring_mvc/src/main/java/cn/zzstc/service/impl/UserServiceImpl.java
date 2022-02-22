package cn.zzstc.service.impl;

import cn.zzstc.dao.UserDao;
import cn.zzstc.dao.impl.UserDaoImpl;
import cn.zzstc.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        this.userDao.save();
    }


}
