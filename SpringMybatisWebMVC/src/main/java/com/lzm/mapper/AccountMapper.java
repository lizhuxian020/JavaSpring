package com.lzm.mapper;

import com.lzm.domain.Account;

import java.util.List;

public interface AccountMapper {

    public void save(Account account);

    public List<Account> findAll();
}
