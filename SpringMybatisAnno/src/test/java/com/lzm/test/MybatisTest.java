package com.lzm.test;

import com.lzm.dao.OrderMapper;
import com.lzm.dao.UserMapper;
import com.lzm.domain.Order;
import com.lzm.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    private SqlSession sqlSession;
    private OrderMapper mapper;
    private UserMapper userMapper;

    @Before
    public void b() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatisConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSession = sessionFactory.openSession();
        mapper = sqlSession.getMapper(OrderMapper.class);
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void test1() {
//        List<User> users = userMapper.findAll();
//        for (User user: users) {
//            System.out.println(user);
//        }
        User user = userMapper.findById(1);
        System.out.println(user);

    }

    @Test
    public void test() {
        List<Order> orders = mapper.findAll();
        for (Order order: orders) {
            System.out.println(order);
        }
    }
}
