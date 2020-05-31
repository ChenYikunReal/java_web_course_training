<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试时间-05-24</title>
</head>
<body>
    <%!
        public String getTime() {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
            java.util.Date date = new java.util.Date();
            return sdf.format(date);
        }
    %>

    <%=getTime()%>

    <%=getTime()%>
</body>
</html>
