package com.lzm.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lzm.domain.User;
import com.lzm.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MpSpringTest {

    @Autowired
    private UserMapper mapper;

    @Test
    public void test4() {

        Page<User> userPage = new Page<User>(1, 2);

        QueryWrapper<User> userQueryWrapper = new QueryWrapper<User>();
        userQueryWrapper.like("email", "lzm");

        Page<User> userPage1 = mapper.selectPage(userPage, userQueryWrapper);

        System.out.println(userPage1.getTotal());
        System.out.println(userPage1.getPages());
        System.out.println(userPage1.getCurrent());
        for (User user: userPage1.getRecords()) {
            System.out.println(user);
        }
    }


    @Test
    public void test3() {


//        mapper.deleteBatchIds(Arrays.asList(7, 8));

        QueryWrapper<User> userQueryWrapper = new QueryWrapper<User>();
        userQueryWrapper.like("email", "@lzm");

        for (User user : mapper.selectList(userQueryWrapper)) {
            System.out.println(user);
        }

    }

    @Test
    public void test2() {

        UpdateWrapper<User> userUpdateWrapper = new UpdateWrapper<User>();
        userUpdateWrapper.set("password", "hahaha")
                        .set("email", "zhangsan@zzstc.cn")
                                .eq("user_name", "zhangsan");

        mapper.update(null, userUpdateWrapper);
    }

    public void test1() {
//        mapper.in
    }

    @Test
    public void test() {
        List<User> users = mapper.selectList(null);
        System.out.println(users);

//        User user = new User();
//        user.setName("曹操1");
//        user.setUser_name("caocao1");
//        user.setPassword("123");
//        user.setAge(19);
//        user.setEmail("test12@zzstc.cn");
//        mapper.insert(user);
//
//        System.out.println(user);
    }
}
