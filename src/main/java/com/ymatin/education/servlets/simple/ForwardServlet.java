package com.ymatin.education.servlets.simple;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ForwardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fw = req.getParameter("fw");
        if ("true".equals(fw)) {
            req.getRequestDispatcher("/toForward").forward(req, resp);
        }
        if ("xyz".equals(fw)) {
            req.getServletContext().getRequestDispatcher("/toForward").forward(req, resp);
        }

        PrintWriter writer = resp.getWriter();
        writer.print("<p>start page</p>");
        writer.print("</br><a href=\"/forward?fw=true\">to Forward Servlet</a>");
        writer.print("</br><a href=\"/forward?fw=xyz\">xyz</a>");
    }
}
