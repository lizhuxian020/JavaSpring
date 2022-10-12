package com.lzm.controller;

import com.lzm.domain.Account;
import com.lzm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/save", produces = "text/json;charset=utf-8")
    @ResponseBody
    public String save(Account name) {
        System.out.println("----" + name);
        accountService.save(name);
        return "保存成功";
    }

    @RequestMapping("/list")
    public ModelAndView findAll(ModelAndView modelAndView) {
        modelAndView.setViewName("accountList");
        List<Account> list = accountService.findAll();
        modelAndView.addObject("accountList", list);
        return modelAndView;
    }

    @RequestMapping("/test")
    public String test()  {
        System.out.println("-----");
        return "test";
    }

}
