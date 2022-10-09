package com.lzm.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.*;

public class DateHandler extends BaseTypeHandler<Date> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Date date, JdbcType jdbcType) throws SQLException {
        System.out.println(date);
    }

    @Override
    public Date getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return null;
    }

    @Override
    public Date getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public Date getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }

}
