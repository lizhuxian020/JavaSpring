package cn.zzstc.test;

import cn.zzstc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDemo1 {

    @Autowired
    private UserService userService; //失败了。因为test里没有代码

    @Test
    public void test() {
        System.out.println("asd");
    }
}
