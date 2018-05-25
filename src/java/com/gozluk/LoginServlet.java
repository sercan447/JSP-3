package com.gozluk;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sercan
 */
@WebServlet(urlPatterns={"/home"})
public class LoginServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
        String uname = req.getParameter("username");
        String pword = req.getParameter("password");
        
        resp.setContentType("text/plain");
        
        PrintWriter pr = resp.getWriter();
        
        if(AuthHelper.isAllowed(uname, pword)){
            RequestDispatcher dispa = req.getRequestDispatcher("app");
            dispa.forward(req, resp);
                    
        }else{
            RequestDispatcher rd = req.getRequestDispatcher("helloError.jsp");
            rd.forward(req, resp);
        }
    }
    
    
    
    
}
