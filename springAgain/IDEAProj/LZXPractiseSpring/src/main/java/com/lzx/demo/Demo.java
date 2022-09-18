package com.lzx.demo;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class Demo {

    public static void main(String[] args) throws SQLException, PropertyVetoException {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setDriverClass("com.mysql.jdbc.Driver");
//        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/lzxdb");
//        dataSource.setUser("root");
//        dataSource.setPassword("qq123123");
//
//        System.out.println(dataSource.getConnection());
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springMVC.xml");
//        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("springContext.xml");
//        JdbcTemplate bean = context.getBean(JdbcTemplate.class);
//        System.out.println(bean);
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        System.out.println(context);
//        ComboPooledDataSource dataSource = (ComboPooledDataSource) context.getBean(DataSource.class);
//        System.out.println(dataSource.getJdbcUrl());
//        System.out.println(dataSource.getDriverClass());
//        System.out.println(dataSource.getUser());
//        System.out.println(dataSource.getPassword());
//        System.out.println(dataSource.getConnection());
    }
}
