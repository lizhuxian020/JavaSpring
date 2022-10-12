package com.lzm.service.impl;

import com.lzm.domain.Account;
import com.lzm.mapper.AccountMapper;
import com.lzm.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public void save(Account account) {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatisConfig.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sessionFactory.openSession();
            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
            mapper.save(account);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Account> findAll() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatisConfig.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sessionFactory.openSession();
            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
            List<Account> all = mapper.findAll();
            sqlSession.commit();
            sqlSession.close();
            return all;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
