package com.lzx.controller;

import com.lzx.service.UserService;
import com.lzx.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/quick1")
    public String quick1() {
        System.out.println("ahhaha");
        return "success.jsp";
    }
}
