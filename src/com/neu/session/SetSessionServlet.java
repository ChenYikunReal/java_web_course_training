package com.neu.session;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SetSessionServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("username", "Jim");
        session.setAttribute("age", 18);
        //session.setAttribute("username", 18);
        //session.setAttribute("username", "18");
        //session.setAttribute("username", "Jim");
        //session.setAttribute("username", "吉姆");
        session.setAttribute("user", new User(11, "HH", "hhh", "123456"));
        //session.removeAttribute("username");
        //session.invalidate();
        response.sendRedirect("GetSessionServlet");
    }

}
