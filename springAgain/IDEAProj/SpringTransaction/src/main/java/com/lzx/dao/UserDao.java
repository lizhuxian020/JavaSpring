package com.lzx.dao;

public interface UserDao {
    public void addUserMoney(String username, int money);
    public void decreaseUserMoney(String username, int money);
}
