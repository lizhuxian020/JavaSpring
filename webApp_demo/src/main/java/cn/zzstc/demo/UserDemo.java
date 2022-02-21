package cn.zzstc.demo;

import cn.zzstc.dao.impl.UserDaoImple;
import cn.zzstc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDemo {
    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}
