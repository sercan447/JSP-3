package com.gozluk;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sercan
 */
public class YorucuDurum extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
       
        PrintWriter rt = resp.getWriter();
        resp.setContentType("text/plain");
        
        Enumeration<String> erol = req.getHeaderNames();
        
        while(erol.hasMoreElements()){
           
            Enumeration<String> egemen = req.getHeaders(erol.nextElement());
                while(egemen.hasMoreElements()){
                    rt.write(egemen.nextElement());
                    rt.write("--");
                }  
          
        }
        
    }
    
    
    
    public void handlem(HttpServletRequest req,HttpServletResponse rest)throws IOException{
        
        PrintWriter pr = rest.getWriter();
        rest.setContentType("text/plain");
    
        String paramName = "myparam";
        String paramValue = req.getParameter(paramName);
        
        pr.write(paramName);
        pr.write(" = ");
        pr.write(paramValue);
        pr.write("n");
        
        paramName = "UNKOWN";
        paramValue = req.getParameter(paramName);
        
        if(paramValue == null){
            pr.write("Parameter "+paramName+ " not found");
        }
        
        pr.close();
    }
    
}
