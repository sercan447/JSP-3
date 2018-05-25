package com.gozluk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sercan
 */
public class UserDAO {
    static  Connection currentCon = null;
    static Connection con = null;
    static PreparedStatement prepare = null;
    
    
    public static UserBean login(UserBean bean){
    
        Statement stat = null;
        String user = bean.getUsername();
        String pass = bean.getPassword();
        
        
        String queryi = "INSERT INTO okuduklarim(okuduklarimKitap) VALUES (?)";
        try{
        
            currentCon = UserDAO.getConnections();
            prepare = currentCon.prepareStatement(queryi);
            prepare.setString(1, user);
            
          boolean CEVAB = prepare.execute();
            bean.setIsValid(true);
            
        }catch(SQLException w){
        
        }
        
      return bean;
    }
    
    public static Connection getConnections(){
            
        try{
        
        String dbadmin = "root";
        String pass = "199144";
        String URL = "jdbc:mysql://localhost:3306/ebookshop";
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(URL,dbadmin,pass);
        
        
        }catch(SQLException we){
        
        }catch(ClassNotFoundException ww){
        
        }
    return con;
    }
    
}
