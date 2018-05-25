<%-- 
    Document   : helloError
    Created on : 27.Şub.2017, 01:03:55
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
   
      <form action="home" method="POST">
        <table>
            <tr>
                <td>isimler</td>
                <td><input type="text" name="username" /></td>
            </tr>
            
            <tr>
                <td>Sifreler</td>
                <td><input type="text" name="password" /></td>
            </tr>
        </table>
        <input type="submit" value="Yıldız bakkal" />
    </form>
    
    
</body>
</html>
