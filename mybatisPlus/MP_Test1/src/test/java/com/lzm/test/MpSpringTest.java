package com.lzm.test;

import com.lzm.domain.User;
import com.lzm.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MpSpringTest {

    @Autowired
    private UserMapper mapper;

    @Test
    public void test() {
        List<User> users = mapper.selectList(null);
        System.out.println(users);
    }
}
