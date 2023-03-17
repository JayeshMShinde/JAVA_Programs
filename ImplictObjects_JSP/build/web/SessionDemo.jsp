<%-- 
    Document   : SessionDemo
    Created on : Mar 8, 2023, 4:24:20 PM
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
        
        <%
            session.setAttribute("user_name", "Ajay Jadhav");
            %>
            <h2>Data Stored </h2>
            <a href="View.jsp">View Data</a>
    </body>
</html>
