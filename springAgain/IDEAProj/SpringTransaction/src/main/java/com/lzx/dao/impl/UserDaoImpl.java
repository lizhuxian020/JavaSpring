package com.lzx.dao.impl;

import com.lzx.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addUserMoney(String username, int money) {
        String sql = "update users set money=money+" +money+" where name="+ "'" +username + "'";
        System.out.println(sql);
        jdbcTemplate.update(sql);
    }

    @Override
    public void decreaseUserMoney(String username, int money) {
        String sql = "update users set money=money-" +money+" where name="+ "'" +username + "'";
        System.out.println(sql);
        jdbcTemplate.update(sql);
    }
}
