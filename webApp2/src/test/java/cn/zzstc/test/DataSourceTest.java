package cn.zzstc.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DataSourceTest {

    @Test
    public void test3() throws PropertyVetoException, SQLException {
        ResourceBundle jdbc = ResourceBundle.getBundle("jdbc");
        String driver = jdbc.getString("jdbc.driver");
        String url = jdbc.getString("jdbc.url");
        String user = jdbc.getString("jdbc.user");
        String pwd = jdbc.getString("jdbc.pwd");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ComboPooledDataSource bean = context.getBean(ComboPooledDataSource.class);
        bean.setDriverClass(driver);
        bean.setJdbcUrl(url);
        bean.setUser(user);
        bean.setPassword(pwd);
        Connection connection = bean.getConnection();
        System.out.println(connection);
        connection.close();

    }

    @Test
    public void test2() throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ComboPooledDataSource bean = context.getBean(ComboPooledDataSource.class);
        Connection connection = bean.getConnection();
        System.out.println(connection);
        connection.close();

    }

    @Test
    public void test1() throws PropertyVetoException, SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/users");
        dataSource.setUser("root");
        dataSource.setPassword("qq123123");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }
}
