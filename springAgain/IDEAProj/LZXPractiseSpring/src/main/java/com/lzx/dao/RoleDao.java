package com.lzx.dao;

import com.lzx.domain.Role;

import java.util.List;

public interface RoleDao {
    public List<Role> list();

    public int addRole(String name, String desc);

    public List<Role> getRoles(Long userId);
}
