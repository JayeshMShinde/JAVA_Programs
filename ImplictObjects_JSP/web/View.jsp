<%-- 
    Document   : View
    Created on : Mar 8, 2023, 4:25:38 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%
            String u=(String)session.getAttribute("user_name");
            
            %>
            <h2>Welcome  <%=u%></h2>
    </body>
</html>
