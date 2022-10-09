package com.lzm.dao;

public interface UserDao {
    public void save();
    public void changeIn(int id, int money);
    public void changeOut(int id, int money);
}
