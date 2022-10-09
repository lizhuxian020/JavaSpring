package com.lzm.dao;

import com.lzm.domain.User;

import java.util.List;

public interface UserMapper {

    public List<User> findAll();

    public User findByCondition(User user);

    public List<User> findByIds(int[] ids);
}
