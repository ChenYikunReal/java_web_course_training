<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.web.vo.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!--
1、测试url重写
2、创建一个jsp页面，设置两个变量，计算和和差，显示在当前的jsp页面中
3、创建一个jsp页面，显示当前的日期和时间（利用SimpleDateFormat对Date的日期进行自定义格式化）
4、创建一个jsp页面，小脚本里创建一个Users对象，设置属性值，判断如果用户名是abc，密码是111提示登录成功，否则提示失败
-->
<html>
<head>
    <title>JSP测试页面</title>
</head>
<body>
    <%
        response.sendRedirect(response.encodeURL("SetSessionServlet"));
        out.print("<a href='"+response.encodeURL("add.jsp")+"'>添加</a>");
    %>
    <%  int a = 3, b = 2, sum = a + b, difference = a - b; %>
    <%="a和b的和为：" + sum + "<br/>a和b的差为：" + difference + "<br/>"%>
    <%=new SimpleDateFormat("MM-dd-yyyy HH:mm:ss").format(new Date()) + "<br/>"%>
    <%
        User user = new User(100, "abc", "111", "123456789");
        if ("abc".equals(user.getUserName()) && "111".equals(user.getPassword())) {
    %>
        登录成功！
    <% } else { %>
        登录失败！
    <% } %>
    <br/>
</body>
</html>
