<%@ page import="com.web.vo.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page A</title>
</head>
<body>
<%
    User user = new User(100, "abc", "111", "123456789");
    request.setAttribute("user", user);
    request.getRequestDispatcher("page_b.jsp").forward(request, response);
%>

</body>
</html>
