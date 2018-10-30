package com.birdidi.jweb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletHi extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("ServletHi.init");
        super.init();
    }

    @Override
    public void destroy() {
        System.out.println("ServletHi.destroy");
        super.destroy();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("req = [" + req + "], resp = [" + resp + "]");
        req.getRequestDispatcher("/hi.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("req = [" + req + "], resp = [" + resp + "]");
        super.doPost(req, resp);
    }
}
