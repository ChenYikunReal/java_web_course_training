package com.web.login;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;

public class SkipToServletServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> map = new HashMap<>();
        map.put("TheShy", "123456");
        map.put("TheKey", "123456");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String password= request.getParameter("password");
        String info;
        if (username == null || username.length() == 0) {
            info = "用户名不能为空";
        } else if (password == null || password.length() == 0) {
            info = "密码不能为空";
        } else if (!map.containsKey(username)) {
            info = "用户名不存在";
        } else if (!password.equals(map.get(username))) {
            info = "密码不正确";
        } else {
            info = "用户名: " + username + ", 密码: " + password;
        }
        request.setAttribute("info", info);
        request.getRequestDispatcher("show.do").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

}
