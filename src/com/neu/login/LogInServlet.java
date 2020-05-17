package com.neu.login;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;

/**
 * 作业2的Servlet
 * @time 2020.5.16
 * @author yk
 */
public class LogInServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> map = new HashMap<>();
        map.put("TheShy", "123456");
        map.put("TheKey", "123456");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password= request.getParameter("password");
        String err_info = null;
        if (username == null || username.length() == 0) {
            err_info = "用户名不能为空";
        } else if (password == null || password.length() == 0) {
            err_info = "密码不能为空";
        } else if (!map.containsKey(username)) {
            err_info = "用户名不存在";
        } else if (!password.equals(map.get(username))) {
            err_info = "密码不正确";
        } else {
            out.println("用户名: " + username + ", 密码: " + password);
        }
        if (err_info != null) {
            out.println(err_info);
        }
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

}
