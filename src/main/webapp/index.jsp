<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>hello is index.jsp</h1>
<%
    response.sendRedirect(request.getContextPath()+"/save.jsp");
%>
</body>
</html>
