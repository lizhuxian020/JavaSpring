package com.lzx.controller;

import com.lzx.domain.Role;
import com.lzx.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/role_list")
    public ModelAndView showRoleList(ModelAndView modelAndView) {
        modelAndView.setViewName("role-list");
        List<Role> roleList = roleService.list();
        System.out.println(roleList);
        modelAndView.addObject("roleList", roleList);
        return modelAndView;
    }
}
