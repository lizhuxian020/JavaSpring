package com.lzx.service.impl;

import com.lzx.dao.RoleDao;
import com.lzx.dao.UserDao;
import com.lzx.domain.Role;
import com.lzx.domain.User;
import com.lzx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    public List<User> list() {
        List<User> userList = userDao.list();
        for (User user : userList) {
            Long userId = user.getId();
            List<Role> roles = roleDao.getRoles(userId);
            user.setRoleList(roles);
        }
        return userList;
    }

    public void addUser(User user, Long[] roleIds) {
        Long userId = userDao.addUser(user);
        userDao.addRole(userId, roleIds);
    }

    public void deleteUser(String userId) {
        userDao.deleteUser(userId);
    }
}
