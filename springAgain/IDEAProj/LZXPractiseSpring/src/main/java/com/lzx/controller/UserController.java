package com.lzx.controller;

import com.lzx.domain.Role;
import com.lzx.domain.User;
import com.lzx.service.RoleService;
import com.lzx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @RequestMapping("/user_list")
    public ModelAndView userList(ModelAndView modelAndView) {
        List<User> userList = userService.list();
        modelAndView.addObject("userList", userList);
        modelAndView.setViewName("user-list");
        return modelAndView;
    }

    @RequestMapping("/user_add")
    public ModelAndView userAddGetRoles(ModelAndView modelAndView) {
        List<Role> list = roleService.list();
        modelAndView.addObject("roleList", list);
        modelAndView.setViewName("user-add");
        return modelAndView;
    }

    @RequestMapping("/addUser")
    public String addUser(User user, Long[] roleIds) {
        userService.addUser(user, roleIds);
        return "redirect:/user/user_list";
    }
}
