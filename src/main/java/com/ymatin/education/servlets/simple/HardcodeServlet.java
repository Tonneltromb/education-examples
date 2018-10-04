package com.ymatin.education.servlets.simple;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Set;

public class HardcodeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding(String.valueOf(StandardCharsets.UTF_8));
        resp.setContentType("text/html");

        String uri = req.getRequestURI();
        System.out.println(uri);

//        Set<String> set = req.getParameterMap().keySet();
//        set.forEach(e -> {
//            Object value = req.getParameter(e);
//            System.out.println(value);
//        });
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
