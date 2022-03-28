package cn.zzstc.demo;

import cn.zzstc.domain.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws PropertyVetoException, SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        List<User> userList = jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<User>(User.class));
        System.out.println(userList);
    }

    private void test1() throws PropertyVetoException {
        System.out.println("asd");

        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/lzm_db_test");
        dataSource.setUser("root");
        dataSource.setPassword("qq123123");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);

        int row = jdbcTemplate.update("insert into user(name, phone) values (?,?)", "tom", "3123123");
        System.out.println(row);
    }

    private void test2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        int row = jdbcTemplate.update("insert into user(name, phone) values (?,?)", "jack", "123321");
        System.out.println(row);
    }
}
