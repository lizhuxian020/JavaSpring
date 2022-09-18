package com.lzx.dao.impl;

import com.lzx.dao.UserDao;
import com.lzx.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> list() {
        List<User> query = jdbcTemplate.query("select * from sys_user", new BeanPropertyRowMapper<User>(User.class));
        return query;
    }
}
