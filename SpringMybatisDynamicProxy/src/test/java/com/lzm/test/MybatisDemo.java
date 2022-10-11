package com.lzm.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzm.dao.UserMapper;
import com.lzm.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisDemo {

    @Test
    public void test4() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("MybatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int[] ids = {11};
        List<User> byIds = mapper.findByIds(ids);
        System.out.println(byIds);
        sqlSession.close();;
    }

    @Test
    public void test3() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("MybatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
//        user.setId(1);
        user.setName("lzm");
        user.setBirthday(new Date());
        System.out.println(user);
        int update = mapper.insert(user);
        System.out.println(update);
        sqlSession.close();;
    }

    @Test
    public void test2() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("MybatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int[] ids = {1, 2, 3};
        List<User> all = mapper.findByIds(ids);
        System.out.println(all);
        sqlSession.close();;
    }

    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("MybatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(1);
        user.setName("lizx");
        user.setPhone("321");

        User byCondition = mapper.findByCondition(user);
        System.out.println(byCondition);
        sqlSession.close();;
    }

    @Test
    public void test() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("MybatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        PageHelper.startPage(1,2);

        List<User> all = mapper.findAll();
        for (User user: all) {
            System.out.println(user);
        }
        System.out.println(all);

        PageInfo pageInfo = new PageInfo(all);
        System.out.println("getFirstPage" + pageInfo.getFirstPage());
        System.out.println("getPageNum" + pageInfo.getPageNum());
        System.out.println("getPageSize" + pageInfo.getPageSize());
        System.out.println("getNextPage" + pageInfo.getNextPage());
        System.out.println("getTotal" + pageInfo.getTotal());
        System.out.println();
        System.out.println();
        sqlSession.close();;
    }
}
