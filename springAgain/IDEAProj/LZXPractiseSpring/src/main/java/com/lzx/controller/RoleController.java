package com.lzx.controller;

import com.lzx.domain.Role;
import com.lzx.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/add_role", method = RequestMethod.POST)
    public String addRole(String roleName, String roleDesc) {
        System.out.println(roleName + roleDesc);
        int i = roleService.addRole(roleName, roleDesc);
        System.out.println(i);
        return "redirect:/role/role_list";
//        return this.showRoleList(new ModelAndView());
    }
}
