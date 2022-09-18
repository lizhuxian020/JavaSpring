package com.lzx.test;

import com.lzx.domain.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springContext.xml")
public class UserTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test3() {
        List<User> users = jdbcTemplate.query("select * from users", new BeanPropertyRowMapper<User>(User.class));
        System.out.println(users);
    }

    @Test
    public  void test2() {
        int delete = jdbcTemplate.update("delete from users where name = 'lzx'");
        System.out.println(delete);
    }

    @Test
    public void test1() throws PropertyVetoException, SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/lzxdb");
        dataSource.setUser("root");
        dataSource.setPassword("qq123123");

        System.out.println(dataSource.getConnection());

//        JdbcTemplate template = new JdbcTemplate();
//        template.setDataSource(dataSource);
//        int row = template.update("insert into users(name, money) values (?,?)", "zqyy", 200);
//        System.out.println(row);
    }
}
