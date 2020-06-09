<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page B</title>
</head>
<body>
<%
    session.setAttribute("num", 111);
    request.getRequestDispatcher("page_c.jsp").forward(request, response);
%>
</body>
</html>
