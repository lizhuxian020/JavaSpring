package com.lzm.dao.impl;

import com.lzm.dao.UserDao;
import com.lzm.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save() {
        List<User> userList = jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<User>(User.class));
        System.out.println(userList);
    }

    @Override
    public void changeIn(int id, int money) {
        int update = jdbcTemplate.update("update user set money=money+? where id=?", money, id);
        System.out.println(update);
    }

    @Override
    public void changeOut(int id, int money) {
        int update = jdbcTemplate.update("update user set money=money-? where id=?", money, id);
        System.out.println(update);
    }
}
