package com.ymatin.education.servlets.simple;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LifecycleServlet extends HttpServlet {

    public LifecycleServlet() {
        System.out.println("constructor");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init method with config");
        super.init(config);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init method");
        super.init();
    }

    @Override
    public void destroy() {
        System.out.println("destroy method");
        super.destroy();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service method");
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet method");
        PrintWriter writer = resp.getWriter();
        writer.print("<h1>Hello<h1>");
    }
}
