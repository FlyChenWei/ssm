<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>list页面</h1>
<table border="0.5px">
    <tr>
        <th>用户id</th>
        <th>姓名</th>
        <th>金额</th>
    </tr>
    <c:forEach items="${list}" var="li">
        <tr>
            <td>${li.id}</td>
            <td>${li.name}</td>
            <td>${li.money}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
