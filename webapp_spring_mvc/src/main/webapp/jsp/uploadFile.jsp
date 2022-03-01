<%--
  Created by IntelliJ IDEA.
  User: suihuanhuan
  Date: 2022/3/1
  Time: 5:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/quick13" enctype="multipart/form-data" method="post">
        用户名<input type="text" name="username" ><br/>
        文件名<input type="file" name="file"><br/>
        <input type="submit" name="提交">
    </form>
</body>
</html>
