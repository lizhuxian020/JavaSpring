package com.lzm.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;


public class DateHandler extends BaseTypeHandler<Date> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Date date, JdbcType jdbcType) throws SQLException {
        long time = date.getTime();
        preparedStatement.setLong(i, time);
    }

    @Override
    public Date getNullableResult(ResultSet resultSet, String s) throws SQLException {
        long aLong = resultSet.getLong(s);
        return new Date(aLong);
    }

    @Override
    public Date getNullableResult(ResultSet resultSet, int i) throws SQLException {
        long aLong = resultSet.getLong(i);
        return new Date(aLong);
    }

    @Override
    public Date getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        long aLong = callableStatement.getLong(i);
        return new Date(aLong);
    }

//    @Override
//    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Date date, JdbcType jdbcType) throws SQLException {
//        System.out.println("----------------------------------------------------");

//    }
//
//    @Override
//    public Date getNullableResult(ResultSet resultSet, String s) throws SQLException {
//        System.out.println("----------------------------------------------------");

//    }
//
//    @Override
//    public Date getNullableResult(ResultSet resultSet, int i) throws SQLException {
//        System.out.println("----------------------------------------------------");
//        long aLong = resultSet.getLong(i);
//        return new Date(aLong);
//    }
//
//    @Override
//    public Date getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
//        System.out.println("----------------------------------------------------");
//        long aLong = callableStatement.getLong(i);
//        return new Date(aLong);
//    }

}
