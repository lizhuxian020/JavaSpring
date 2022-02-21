package cn.zzstc.test;

import cn.zzstc.dao.impl.UserDaoImple;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springBeanTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDaoImple impl1 = (UserDaoImple) app.getBean("userDao");
        UserDaoImple impl2 = (UserDaoImple) app.getBean("userDao");
        System.out.println(impl1);
        System.out.println(impl2);
        app.close();
    }
}
