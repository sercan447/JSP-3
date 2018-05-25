<%-- 
    Document   : Karniyarik
    Created on : 27.Şub.2017, 00:31:06
    Author     : Sercan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    The user agent : <%= request.getHeader("user-agent") %><br/>
    
    Request method;<br/>
    <%= request.getMethod() %>
    <br/>
    
    Request URI:<br/>
    <%= request.getRequestURI() %>
    <br/>
    
    Request protocol<br/>
    <%= request.getProtocol() %>
    <br/>
    
    <%= request.getRemoteHost() %>
    <br/>
    
    Remote Address <br/>
    <%= request.getRemoteAddr() %>
    
    
    <%
        String bk = "http://www.mynet.com";
        //response.sendRedirect(bk);
    %>
    
    <jsp:include page="Calle.jsp">
        <jsp:param name="suphe" value="guzel" />
        <jsp:param name="kantin" value="atelyo" />
    </jsp:include>   
    
 
    
</body>
</html>
