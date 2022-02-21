package cn.zzstc.demo;

import cn.zzstc.dao.impl.UserDaoImple;
import cn.zzstc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserDemo {
    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        FileSystemXmlApplicationContext app = new FileSystemXmlApplicationContext("/Users/zhuxianli/workspace/JavaSpring/webApp_demo/src/main/resources/ApplicationContext.xml");
//        UserService userService = (UserService) app.getBean("userService");
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }
}
