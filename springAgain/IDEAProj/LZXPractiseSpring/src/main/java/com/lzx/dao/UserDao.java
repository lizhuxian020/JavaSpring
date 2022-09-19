package com.lzx.dao;

import com.lzx.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> list();

    Long addUser(User user);

    void addRole(Long userId, Long[] roleIds);

    void deleteUser(String userId);

    User getUser(String username);
}
