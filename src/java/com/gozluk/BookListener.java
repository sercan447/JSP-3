package com.gozluk;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/yuzdeguzel"})
public class BookListener extends HttpServlet{
    
    public static final String KULLANICI = "root";
    protected static final String SIFRE = "199144";
    private final String ADRES = "jdbc:mysql://localhost:3306/ebookshop";
    private final String  sorgu = "SELECT * FROM okuduklarim";

    Connection connecti = null;
    Statement statement = null;
    ResultSet resultset = null;
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
        try{
        connecti = DriverManager.getConnection(ADRES, KULLANICI, SIFRE);
        statement = connecti.createStatement();
        resultset = statement.executeQuery(sorgu);
        
            while(resultset.next()){
                
                resp.getWriter().write(resultset.getString(1));
                resp.getWriter().write(" - ");
                resp.getWriter().write(resultset.getString(2));
               
            }
        
        }catch(SQLException et){
        
        }finally{
            try{
                if(connecti != null)
                    connecti.close();
            }catch(SQLException esi){
                resp.getWriter().write("Kapatılamadı close");
            }
           
            
        }
    }
    
    
    
    
            
    
    
}
