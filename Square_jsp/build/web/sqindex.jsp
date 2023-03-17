<%-- 
    Document   : sqindex
    Created on : Feb 9, 2023, 4:15:22 PM
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
            String num = request.getParameter("textnum");
            int a = Integer.parseInt(num);
            int s = a* a;
            out.println("Square is:"+s);
        %>
    </body>
</html>
