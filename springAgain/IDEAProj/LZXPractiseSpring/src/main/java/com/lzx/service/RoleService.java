package com.lzx.service;

import com.lzx.domain.Role;

import java.util.List;

public interface RoleService {
    public List<Role> list();
    public int addRole(String name, String desc);
}
