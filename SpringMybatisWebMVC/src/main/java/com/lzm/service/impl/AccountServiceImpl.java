package com.lzm.service.impl;

import com.lzm.domain.Account;
import com.lzm.mapper.AccountMapper;
import com.lzm.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void save(Account account) {
       accountMapper.save(account);
       int i = 1/0;
    }

    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }
}
