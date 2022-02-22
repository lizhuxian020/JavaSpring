package cn.zzstc.demo;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class Demo1 {
    public static void main(String[] args) throws SQLException, PropertyVetoException {

        System.out.println("asd");
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/users");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("qq123123");
        Connection connection = comboPooledDataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
