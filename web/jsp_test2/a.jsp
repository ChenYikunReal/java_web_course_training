<%@ page import="com.web.vo.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>A</title>
</head>
<body>
    <%
        session.setAttribute("str", "test");
        request.setAttribute("user", new User(100, "Sam", "123456", "123456"));
        request.getRequestDispatcher("b.jsp").forward(request, response);
    %>
    <%@include file="head.jsp"%>
    <%@include file="footer.jsp"%>
</body>
</html>
