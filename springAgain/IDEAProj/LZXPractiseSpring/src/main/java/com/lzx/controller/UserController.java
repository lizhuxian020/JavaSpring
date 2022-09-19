package com.lzx.controller;

import com.lzx.domain.Role;
import com.lzx.domain.User;
import com.lzx.service.RoleService;
import com.lzx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
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

    @RequestMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable(value = "userId") String userId) {
        System.out.println("删除用户"+ userId);
        userService.deleteUser(userId);
        return "redirect:/user/user_list";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password, HttpSession session) {
        User user = userService.login(username, password);
        if (user != null) {
            session.setAttribute("user", user);
            return "redirect:/index.jsp";
        }
        return "redirect:/login.jsp";
    }
}
