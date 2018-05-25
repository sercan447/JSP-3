package com.gozluk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Sercan
 */
@WebServlet(urlPatterns = {"/uploaded"},name="FileUploaded")
@MultipartConfig
public class Kita extends HttpServlet{
    
    private final String  serverPath = "/tmp/cfg";

    @Override
    public void init() throws ServletException {
       System.out.println("albay refet bet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      ServletOutputStream aci = resp.getOutputStream();
      
      aci.print("Kendi ispatlarına calısıp sırası gelince aciklama yapacak");
      
    }    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        resp.getWriter().write("dernek");
        
       /* resp.setContentType("text/html;charset=UTF-8");
        
        final Part filePart = req.getPart("file");
        String filename = getFileName(filePart);
        
        OutputStream out = null;
       InputStream filecontent = null;
        
       final PrintWriter writer = resp.getWriter();
       
       try{
           out = new FileOutputStream(new File(serverPath + File.separator + filename));
           filecontent = filePart.getInputStream();
           
           int read = 0;
           final byte[] bytes = new byte[1024];
           while((read = filecontent.read(bytes)) != -1){
               out.write(bytes,0,read);
           }
           
           writer.println("New file "+filename + "craeted bt "+serverPath);
           
           
           
       }catch(FileNotFoundException we){
       
       }finally{
            if(out != null){
                out.close();
            }
            if(filecontent != null)
                filecontent.close();
            
           if(writer != null)
               writer.close();
            
       }*/
       
        
    }
    
    
   private String getFileName(Part filepart){
    String header = filepart.getHeader("content-disposition");
    String name = header.substring(header.indexOf("filename=\'")+10);
   
    return name.substring(0,name.indexOf("\'"));
   }
    
}
