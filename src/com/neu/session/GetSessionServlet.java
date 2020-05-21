package com.neu.session;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class GetSessionServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("username");
        Integer age = (Integer)session.getAttribute("age");
        User user = (User)session.getAttribute("user");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //out.println(username);
        out.println("用户名：" + username + "<br/>用户年龄：" + age + "<br/>某用户信息：" + user.toString());
    }

}
