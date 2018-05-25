package com.gozluk;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sercan
 */
@WebServlet(urlPatterns={"/batlama"})
public class Family extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        PrintWriter pr = resp.getWriter();
        pr.println("<html>");
        pr.print("<head>");
        pr.println("<title>BU YARDIM LIBERALIMZ</title>");
        pr.println("</head>");
        pr.println("<body>");
        pr.println("My dair  @ "+new Date());
        pr.println("</body>");
        pr.println("</html>");
        
    }
    
    
    
}
