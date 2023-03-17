

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            h1{
                color: red;
                text-decoration: blink;
            }
            input.button{
                text-align: center;
                border-color: black;
                height: 25px;
                width:100px;
                
            }
        </style>
    </head>
    <body>
        <%
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
        %>
        <h1>Add New Employee</h1>
        <form method="post">
            <table>
                <tr>
                    <td>Employee Id:</td>
                    <td><input type="text" name="txteid"/></td>
                </tr>
                <tr>
                    <td>EName:</td>
                    <td><input type="text" name="txtename"/></td>
                </tr>
                <tr>
                    <td>City:</td>
                    <td><input type="text" name="txtcity"/></td>
                </tr>
                <tr>
                    <td>Salary:</td>
                    <td><input type="text" name="txtsal"/></td>
                </tr>
                <tr>
                    <td colspan="2" ><input class="button" type="submit" value="submit"/>
                        &nbsp;
                        <a href="display_emp.jsp">View Employee</a>
                    </td>
                </tr>
            </table>
        </form>
        <%
             if(request.getMethod().equals("POST")){
                 int r = Integer.parseInt(request.getParameter("txteid"));
                 String n = request.getParameter("txtename");
                 String c = request.getParameter("txtcity");
                 float s = Float.parseFloat(request.getParameter("txtsal"));
                 Statement st = con.createStatement();
                 int cnt = st.executeUpdate("insert into tblemp values("+r+",'"+n+"','"+c+"',"+s+")");
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
