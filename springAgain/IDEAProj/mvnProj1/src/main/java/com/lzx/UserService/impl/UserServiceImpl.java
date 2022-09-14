package com.lzx.UserService.impl;

import com.lzx.UserDao.UserDao;
import com.lzx.UserService.UserService;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserServiceImpl implements UserService {

    private List<String> list;
    private Map<String, String> map;
    private Properties properties;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    //    private UserDao dao;
//
//    public void setDao(UserDao dao) {
//        this.dao = dao;
//    }

    @Override
    public void save() {
//        dao.save();
        System.out.println("-----" + list + "--" + map + "----" + properties) ;
    }
}
