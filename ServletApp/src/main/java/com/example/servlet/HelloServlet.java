package com.example.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

    // Handle GET requests by forwarding to doPost
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    // Handle POST requests
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve parameters from the request
        String name = request.getParameter("name");
        String branch = request.getParameter("branch");

        // Set content type and write response
        response.setContentType("text/html");
        response.getWriter().println("<h2>Welcome to Servlet</h2>");
        response.getWriter().println("<p>Hello " + name + " from " + branch + "!</p>");
    }
}
