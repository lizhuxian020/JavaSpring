package com.lzm.dao;

import com.lzm.domain.Order;
import com.lzm.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface OrderMapper {

    @Select("SELECT *, uo.id oid FROM u_order uo,user u WHERE uo.uid=u.id")
    @Results({
//            @Result(column = "uid", property = "user.id"),
//            @Result(column = "name", property = "user.name"),
//            @Result(column = "phone", property = "user.phone"),
//            @Result(column = "birthday", property = "user.birthday"),
            @Result(column = "uid", property = "user", javaType = User.class,
            one = @One(select = "com.lzm.dao.UserMapper.findById")
            )
    })
    public List<Order> findAll();
}
