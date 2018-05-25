
package com.gozluk;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sercan
 */
@WebServlet(urlPatterns = {"/emreaydin"})
public class FirstSevlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        resp.getWriter().println("First Servlet on Jetty -Java codeee greeks");
        resp.getWriter().println("IN Post First Servlet content");
        
        resp.getWriter().println("------------");
        resp.getWriter().println(req.getParameter("field"));
    }
    
    
    
}
