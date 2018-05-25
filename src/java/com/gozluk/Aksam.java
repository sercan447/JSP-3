
package com.gozluk;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Aksam extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        
        PrintWriter ty = resp.getWriter();
        resp.setContentType("text/plain");
        
        ty.write("user-agent");
        ty.write(req.getHeader("user-agent"));
        
        ty.write("--Remote addr : "+req.getRemoteAddr());
        ty.write("--Remote host :"+req.getRemoteHost());
    }

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
      super.init(config);
        Enumeration<String> initparm = config.getInitParameterNames();
        System.out.println(initparm);
        
        while(initparm.hasMoreElements()){
            String initParamName = initparm.nextElement();
            String paramValue = config.getInitParameter(initParamName);
            
            System.out.println(initParamName + "--"+paramValue);
        }
    }
    
    
    
    
    
}
