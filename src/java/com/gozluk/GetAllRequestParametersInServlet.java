package com.gozluk;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GetAllRequestParametersInServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        handleRequest(req, resp);
    // resp.getWriter().write("kes sesini");
    }

   
    
    
    public void handleRequest(HttpServletRequest reqi , HttpServletResponse resi)throws IOException{
    
        PrintWriter ot = resi.getWriter();
      //  resi.setContentType("text/plain");
        
        Enumeration<String> parametNams = reqi.getParameterNames();
        while(parametNams.hasMoreElements()){
            String paramName = parametNams.nextElement();
            ot.write(paramName);
            ot.write("=");
        
        
        String[] paramValues = reqi.getParameterValues(paramName);
            for(int i=0;i<paramValues.length;i++){
                
                    String paramValue = paramValues[i];
                    ot.write("="+paramValue);
                    ot.write("--");
            }//for
        }//while
        
        
    }
    
}
