<%-- 
    Document   : second
    Created on : 26.Şub.2017, 21:33:19
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
    <form method="GET">
        <input type="checkbox" name="author" value="aili" />Ali
        <input type="checkbox" name="author" value="yalana" />Tufan
        <input type="checkbox" name="author" value="masal" />Masal
        <br/>
        <input type="submit" value="Query" />
    </form>
    
    <%
        String[] authors = request.getParameterValues("author");
        if(authors != null){
            %>
            <h3>Secili Yerler : </h3>
            <%
                for(String g : authors){
                    %>
                    <p> <%= g %> </p>
                    <%
                }
        }
    
    %>
    
    <a href="<%= request.getRequestURI()%>">Wathces</a>
</body>
</html>
