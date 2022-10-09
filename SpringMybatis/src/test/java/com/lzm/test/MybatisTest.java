package com.lzm.test;

import com.lzm.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void test2() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();

        User user = new User();
        user.setName("lizx");
        user.setPhone("321");
        user.setMoney(1000);
        user.setId(1);
        int insert = sqlSession.update("UserMapper.update", user);

        System.out.println(insert);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();

        User user = new User();
        user.setName("asdasd");
        user.setPhone("123123");
        int insert = sqlSession.insert("UserMapper.insert", user);

        System.out.println(insert);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        List<User> list = sqlSession.selectList("UserMapper.save");

        System.out.println(list);
    }
}
