<%--
  Created by IntelliJ IDEA.
  User: zzer
  Date: 2022/10/12
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>显示所有账户</h1>
<table>
    <tr>
        <th>账户id</th>
        <th>账户名称</th>
        <th>账户金额</th>
    </tr>
    <c:forEach items="${accountList}" var="account">
        <tr>
            <th>${account.id}</th>
            <th>${account.name}</th>
            <th>${account.money}</th>
        </tr>
    </c:forEach>

</table>
</body>
</html>
