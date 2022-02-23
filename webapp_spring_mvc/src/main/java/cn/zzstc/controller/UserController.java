package cn.zzstc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/quick")
    private String func1() {
        System.out.println("asd");
        return "success.jsp";
    }

}
