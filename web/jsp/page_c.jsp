<%@ page import="com.neu.vo.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User users = (User)request.getAttribute("user");
    Integer num = (Integer)session.getAttribute("num");
    String id = "用户ID：" + users.getUserId() + "<br/>";
    String name = "用户名：" + users.getUserName() + "<br/>";
    String password = "用户密码：" + users.getPassword() + "<br/>";
    String tel_num= "用户手机号码：" + users.getTelephoneNumber() + "<br/>";
%>
<%=id%>
<%=name%>
<%=password%>
<%=tel_num%>
<%--题目没说要打印这个数字，所以注释掉：<%=num%>--%>
</body>
</html>
