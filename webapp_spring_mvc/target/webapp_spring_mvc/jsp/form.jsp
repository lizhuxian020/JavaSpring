<%--
  Created by IntelliJ IDEA.
  User: suihuanhuan
  Date: 2022/2/28
  Time: 5:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/user/quick7" method="post">
  <input type="text" name="userList[0].username"><br/>
  <input type="text" name="userList[0].age"><br/>
  <input type="text" name="userList[1].username"><br/>
  <input type="text" name="userList[1].age"><br/>
  <input type="submit" value="提交">
</form>
</body>
</html>
