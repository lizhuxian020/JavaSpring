package com.lzm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_user")
public class User extends Model<User> {

    @TableId(type = IdType.AUTO)
    private int id;
    private String user_name;

//    @TableField(select = false)
    private String password;
    private String name;
    private int age;
    @TableField(value="email")
    private String mail;

    @TableField(exist = false)
    private String address;

}
