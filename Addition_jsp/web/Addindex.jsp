<%-- 
    Document   : Addindex
    Created on : Feb 9, 2023, 4:25:13 PM
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
            try{
            String a = request.getParameter("anum");
            String b = request.getParameter("bnum");
            int a1 = Integer.parseInt(a);
            int b1 = Integer.parseInt(b);
            int sum = a1+b1;
            int sub = a1 - b1;
            int mul = a1 * b1;
            int div = a1/b1;
            out.println("Addition is:"+sum+"<br/>");
            out.println("Substration is:"+sub+"<br/>");
            out.println("Multiplication is:"+mul+"<br/>");
            out.println("Division is:"+div+"<br/>");
            }
            catch(Exception e){
                out.println(e.getMessage());
            }
        %>
    </body>
</html>
