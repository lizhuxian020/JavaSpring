package com.lzx.controller;

import com.lzx.domain.User;
import com.lzx.service.UserService;
import com.lzx.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UserController {

    @RequestMapping("/quick3")
    @ResponseBody
    public void quick3(String name, MultipartFile[] files) throws IOException {
        System.out.println(name);
        System.out.println(files);
        for (int i = 0; i < files.length; i++) {
            MultipartFile file = files[i];
            String fileName = file.getOriginalFilename();
            file.transferTo(new File("/Users/zhuxianli/Desktop/" + i + fileName ));
        }
    }

    @RequestMapping("/quick2")
    @ResponseBody
    public User quick2() {
        User user = new User();
        user.name = "asd";
        user.age = 11;
        return user;
    }

    @RequestMapping("/quick1")
    public String quick1(Model model) {
        System.out.println("ahhaha");
        model.addAttribute("name", "lzx");
        return "success.jsp";
    }
}
