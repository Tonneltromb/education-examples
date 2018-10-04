package com.ymatin.education.servlets.simple;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class StartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding(String.valueOf(StandardCharsets.UTF_8));
        resp.setContentType("text/html");
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
