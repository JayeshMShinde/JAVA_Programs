<%-- 
    Document   : jsp_demo
    Created on : Feb 8, 2023, 4:51:44 PM
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
        <h1>Welcome to jsp  Web Application</h1>
        
        
        <%
            int a =10,b = 20;
            int c = a+b;
            out.println("<h2>Addition is :"+c+"</h2>");
            
            a = 20;
            b =  30;
            c = b -a ;
            out.println("<h2>Substraction is :"+c+"</h2>");
            
           
        %>
    </body>
</html>
