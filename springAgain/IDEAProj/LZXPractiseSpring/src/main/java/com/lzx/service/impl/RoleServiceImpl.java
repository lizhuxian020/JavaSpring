package com.lzx.service.impl;

import com.lzx.dao.RoleDao;
import com.lzx.domain.Role;
import com.lzx.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    public List<Role> list() {
        return roleDao.list();
    }

    public int addRole(String name, String desc) {
        int i = roleDao.addRole(name, desc);
        return i;
    }
}
