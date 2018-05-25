package com.gozluk;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sercan
 */
@WebServlet(urlPatterns={"/app"})
public class AppServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        resp.setContentType("text/html");
        PrintWriter py = resp.getWriter();
        
        String unme = req.getParameter("username");
        py.print("Hello "+unme);
        
        py.close();
    }
    
    
}
