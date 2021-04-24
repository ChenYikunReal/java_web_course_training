package com.web.login;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;

/**
 * 作业3的Servlet
 * @time 2020.5.16
 * @author yk
 */
public class ShowInfoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        String info = (String)request.getAttribute("info");
        out.println(info);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

}
