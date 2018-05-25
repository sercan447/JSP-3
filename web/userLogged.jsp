<%-- 
    Document   : userLogged
    Created on : 27.Şub.2017, 11:17:37
    Author     : Sercan
--%>

<%@page import="com.gozluk.UserBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
<center>
    Başarılı kayit
    
    <%
        UserBean basariliUser = (UserBean) session.getAttribute("kullaniciIsmi");
        
    %>
    
    <% out.println("HOSGELDIN BRO "+basariliUser.getUsername());%>
    
</center>
    
</body>
</html>
