package com.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetCookieServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 创建Cookie
        Cookie cookie1 = new Cookie("info1", "hello1");
        Cookie cookie2 = new Cookie("info2", "hello2");
        Cookie cookie3 = new Cookie("info3", "hello3");
        // 设置cookie有效时间
        cookie1.setMaxAge(10);
        cookie2.setMaxAge(20);
        // 存cookie
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        response.addCookie(cookie3);
        // 重定向
        response.sendRedirect("GetCookieServlet");
    }

}
