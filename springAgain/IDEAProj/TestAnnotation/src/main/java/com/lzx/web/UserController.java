package com.lzx.web;

import com.lzx.config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserController {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        System.out.println(context);
    }
}
