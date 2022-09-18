package com.lzx.service;

import com.lzx.domain.User;

import java.util.List;

public interface UserService {
    public List<User> list();

    public void addUser(User user, Long[] roleIds);

    public void deleteUser(String userId);
}
