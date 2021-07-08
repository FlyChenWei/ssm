<%--
  Created by IntelliJ IDEA.
  User: FLY陈威
  Date: 2021/7/8
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/account/save">
    用户id:<input type="text" name="id"><br>
    用户姓名:<input type="text" name="name"/><br>
    账户金额:<input type="text" name="money"/><br>
    <input type="submit" value="提交"><br>
</form>
</body>
</html>
