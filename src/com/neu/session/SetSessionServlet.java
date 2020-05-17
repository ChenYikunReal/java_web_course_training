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
//        String sessionId = session.getId();
//        System.out.println(sessionId);
        session.setAttribute("username", "Jim");
        session.setAttribute("userAge", 18);
        response.sendRedirect("GetSessionServlet");
    }

}
