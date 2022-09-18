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

    public int addRole(String name, String desc) {
        int update = jdbcTemplate.update("insert into sys_role(roleName, roleDesc) values (?,?)", name, desc);
        return update;
    }

    public List<Role> getRoles(Long userId) {
        List<Role> roleList = jdbcTemplate.query("select * from sys_user_role ru, sys_role r where ru.roleId=r.id and ru.userId=?", new BeanPropertyRowMapper<Role>(Role.class), userId);
        return roleList;
    }
}
