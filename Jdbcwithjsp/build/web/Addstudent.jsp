<%-- 
    Document   : Addstudent
    Created on : Feb 9, 2023, 5:36:32 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
        %>
        <h1>Add New Student</h1>
        <form method="post">
            <table>
                <tr>
                    <td>Roll no:</td>
                    <td><input type="text" name="txtrno"/></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="txtname"/></td>
                </tr>
                <tr>
                    <td>English:</td>
                    <td><input type="text" name="txteng"/></td>
                </tr>
                <tr>
                    <td>Maths:</td>
                    <td><input type="text" name="txtmath"/></td>
                </tr>
                <tr>
                    <td>Science:</td>
                    <td><input type="text" name="txtsci"/></td>
                </tr>
                <tr>
                    <td colspan="2" ><input type="submit" value="submit"/>
                        &nbsp;
                        <a href="Display.jsp">View Student</a>
                    </td>
                </tr>
            </table>
        </form>
        <%
             if(request.getMethod().equals("POST")){
                 int r = Integer.parseInt(request.getParameter("txtrno"));
                 String n = request.getParameter("txtname");
                 float e = Float.parseFloat(request.getParameter("txteng"));
                 float m = Float.parseFloat(request.getParameter("txtmath"));
                 float s = Float.parseFloat(request.getParameter("txtsci"));
                 Statement st = con.createStatement();
                 int cnt = st.executeUpdate("insert into tblStudent values("+r+",'"+n+"',"+e+","+m+","+s+")");
                 if(cnt>0){
                     out.println("<h2>Data Added Successfully</h2>");
                 }
                 else{
                     out.println("<h2>Error....!!!!</h2>");
                 }
             }
        %>
    </body>
</html>
