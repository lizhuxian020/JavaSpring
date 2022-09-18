package com.lzx.dao.impl;

import com.lzx.dao.RoleDao;
import com.lzx.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Role> list() {
        List<Role> roleList = jdbcTemplate.query ("select * from sys_role", new BeanPropertyRowMapper<Role>(Role.class));
        return roleList;
    }
}
