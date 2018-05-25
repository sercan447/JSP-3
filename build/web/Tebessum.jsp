<%-- 
    Document   : Tebessum
    Created on : 26.Şub.2017, 23:12:33
    Author     : Sercan
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
  
    <%
        PrintWriter pw = response.getWriter();
        
    %>
    
    <% out.println(request.getLocale().toString()); %>
    <br/>
    <%= config.getServletName() %>
    <br/>
    <%= application.getServerInfo() %>
    <br/>
    <%= page.getClass().getName() %>
    <br/>
    <%= session.getCreationTime() %>
    <br/>
    <%= pageContext.getClass().getName() %>
    <br/>
    
    <%! 
        int a =48;
        int b = 9;
        
    %>
    
    First Num : <% out.println(a); %>
    <br/>
    Second Num : <%= b %>
    <br/>
    
    <%! 
        int dep,ket;
        public int aci(int n1,int n2){return n1 + n2;}
    %>
    
<c:forEach var="iradem" begin="5" end="10">
    <c:out  value="${iradem}" /><br/>
</c:forEach>
    
    
    <form action="jcgservlet" method="get">
        <input type="text" name="veri1" />
        <br/>
        <input type="text" name="veri2" />
        <br/>
        <input type="submit" value="erol" />
    </form>
    
    
</body>
</html>
