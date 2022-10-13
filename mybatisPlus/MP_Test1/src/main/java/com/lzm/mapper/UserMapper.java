package com.lzm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lzm.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapper extends BaseMapper<User> {

    @Select("select * from tb_user")
    public List<User> findAll();
}
