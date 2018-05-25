<%-- 
    Document   : incir
    Created on : 26.Şub.2017, 16:49:21
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
 
    <%= "ne ekmek nede bir yudum su" %>
    
    <%
        double num   = Math.random();
        if(num < 0.95){ 
    %>
    <h2>You'll hava a luck day</h2>
    <% 
    }else {
    %>
    <h2>Well life goes on ...</h2>
    <%
    }
    %>
    
    
    <a href="<%= request.getRequestURI() %>"><h3>Try Again duvet</h3><a> 
            <%= request.getRequestURI() %>
            <br/>
            
            <%
                out.write("<html>\r\n");
                double nume = Math.random();
                
                if(nume > 0.95){
                 out.write("<h2>0.95 den büyük");
                 out.write("</h2><p>(");
                 out.print("Sayi Uber :  "+nume);
                 out.write(")</p>\r\n");
                }else {
                    out.write("\r\n   ");
                    out.write("<h2>Kucuk sayi ...");
                    out.write("</h2><p>(");
                    out.print("Sayi kucuk : "+nume);
                    out.write("]</p>\r\n");
                }   
                    
            %>
            <%
                out.write("<a href=\'");
                out.print(request.getRequestURI());
                out.write("\'>");
                out.write("<h3>Tekrardn  yap</h3></a>\r\n");
                out.write("</html>\r\n");
            %>
            
            
</body>
</html>
