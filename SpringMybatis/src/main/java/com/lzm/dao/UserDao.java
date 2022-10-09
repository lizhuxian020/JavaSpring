package com.lzm.dao;

import com.lzm.domain.User;

public interface UserDao {
    public void save();
    public void insert(User user);
    public void update(User user);
    public void changeIn(int id, int money);
    public void changeOut(int id, int money);
}
