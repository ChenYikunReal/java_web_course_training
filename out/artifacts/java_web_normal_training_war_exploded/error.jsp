<%--
  Created by IntelliJ IDEA.
  User: yk
  Date: 2020/5/16
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>错误</title>
</head>
<body>
    <%
        String info = (String) request.getAttribute("info");
        out.println(info);
    %>
</body>
</html>
