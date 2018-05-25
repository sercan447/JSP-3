<%-- 
    Document   : Degerler
    Created on : 26.Şub.2017, 23:37:28
    Author     : Sercan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"  errorPage="hatalarKumesi.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
   <%
     //  int c = 10/0;
   %>
   
   <c:set var="sitem" value="gorusmek üzere" />
   <c:out  value="${sitem}"  />
   
   
</body>
</html>
