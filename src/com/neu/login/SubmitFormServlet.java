package com.neu.login;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.ServletException;

/**
 * 作业1的Servlet
 * @time 2020.5.16
 * @author yk
 */
public class SubmitFormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String[] likes = request.getParameterValues("likes");
        StringBuilder likes_str = new StringBuilder();
        likes_str.append("用户名: ").append(username).append("<br/>密码: ").append(password).append("<br/>性别: ")
                .append(gender).append("<br/>爱好: ");
        for (String s : likes) {
            likes_str.append(s).append("、");
        }
        PrintWriter out = response.getWriter();
        out.println(likes_str.substring(0, likes_str.length()-1));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

}
