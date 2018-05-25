package com.gozluk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/booksing"})
public class BookInsert  extends HttpServlet{
    
    public static final String KULLANICI = "root";
    protected static final String SIFRE = "199144";
    private final String adres = "jdbc:mysql://localhost:3306/ebookshop";
    private final String sqli = "INSERT INTO ebookshop.okuduklarim (OkuduklarimKitap) VALUES(?)";

    @Override
    public void init() throws ServletException {
    
    }    
           
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Connection connect = null;
       
        resp.setContentType("text/html");
        PrintWriter pr = resp.getWriter();
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
           connect = DriverManager.getConnection(adres,KULLANICI,SIFRE);
            PreparedStatement Prestatement = connect.prepareStatement(sqli);
                              Prestatement.setString(1, "SERMAYE");
                              
                              Prestatement.execute();
  
        }catch(ClassNotFoundException fo){
        
                pr.print(fo.getMessage());
        }catch(SQLException o){
                pr.print(o.getMessage());
        }finally{
            try{
                if(connect != null)
                connect.close();
            }catch(SQLException rtew){
            }
            
        }
        
        
    }
    
    
    
    
}
