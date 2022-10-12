package com.lzm.dao;

import com.lzm.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    public List<User> findAll();

    @Select("select * from user where id=#{id}")
    public User findById(int id);
}
