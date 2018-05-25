<%-- 
    Document   : query.jsp
    Created on : 26.Şub.2017, 21:43:09
    Author     : Sercan
--%>




<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type"  lang="java" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <form method="GET">
        <input type="checkbox" name="kitapsec" value="Adsız" />Adsız Turk
        <input type="checkbox" name="kitapsec" value="Hafıza" />Hafızala
        <input type="checkbox" name="kitapsec" value="See" />See
        <input type="checkbox" name="kitapsec"  value="Dolu" />Dolu
        <br/>
        
        <input type="submit" value="Sorgula Baby" />
    </form>
    
    <%
      
        String secilenVeri[] = request.getParameterValues("kitapsec");
      
            if(secilenVeri != null){
                
        String dol = "";
        for(String vol : secilenVeri){
            dol += vol+"-";
        }
        
        try{
         Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root","199144");
        
           Statement stmt = con.createStatement();
        
        String sorgu = "SELECT * FROM okuduklarim";
       ResultSet result = stmt.executeQuery(sorgu);
       
        while(result.next()){
            out.write(result.getString("okuduklarimKitap")+"<br/>");
        }
      
        }catch(Exception e){
            out.write(e.getMessage() + "- ");
            e.printStackTrace();
        }
        
      
           
     
        
     

       }
    %>
    
    
    
</body>
</html>
