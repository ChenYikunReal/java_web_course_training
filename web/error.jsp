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
