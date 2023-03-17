<%-- 
    Document   : countvisits
    Created on : Mar 8, 2023, 4:27:30 PM
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
            Integer cnt=(Integer) (application.getAttribute("count"));
            if(cnt==null)
                {
                    cnt=1;
                }
                else
                {
                    cnt++;
                }
                out.println("<h2>You have visited this site "+cnt+" times</h2>");
                application.setAttribute("count", cnt);
            %>
    </body>
</html>
