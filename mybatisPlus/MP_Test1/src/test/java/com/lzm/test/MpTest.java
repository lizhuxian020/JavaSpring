package com.lzm.test;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import com.lzm.domain.User;
import com.lzm.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MpTest {

    private UserMapper mapper;

    @Before
    public void befor() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatisConfig.xml");
        SqlSessionFactory build = new MybatisSqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        mapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void test() {
//        List<User> list = mapper.findAll();
        List<User> list = mapper.selectList(null);
        for (User user: list) {
            System.out.println(user);
        }
    }
}
