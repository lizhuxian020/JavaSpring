package com.lzm.dao;

import com.lzm.domain.Order;
import com.lzm.domain.User;
import com.lzm.handler.DateTypeHandler;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    @Results(
            @Result(column = "birthday", property = "birthday", typeHandler = DateTypeHandler.class)
    )
    public List<User> findAll();

    @Select("select * from user where id=#{id}")
    public User findById(int id);

    @Select("select * from user")
    @Results({
            @Result(column = "id", property = "orders", javaType = List.class,
                    many = @Many(select = "com.lzm.dao.OrderMapper.findByUid")
            )
    })
    public List<User> findAllUserOrder();
}
