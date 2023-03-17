<%-- 
    Document   : Display
    Created on : Feb 9, 2023, 5:20:19 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="AddEmployee.jsp">Add Employee</a>
        <%
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from tblemp");
        %>
        <h1>ALL STUDENT</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Employee id</th>
                    <th>Employee Name</th>
                    <th>City</th>
                    <th>Salary</th>                  
                </tr>
            </thead>
            <tbody>
                <%
                    while(rs.next()){
                        int eid = rs.getInt("eid");
                        String n = rs.getString("ename");
                        String c = rs.getString("city");
                        float s = rs.getFloat("salary");
                        %>
                        <tr>
                            <td><%=eid %></td>
                            <td><%=n %></td>
                            <td><%=c %></td>
                            <td><%=s %></td>
                        </tr>
                        <%
                                
                    }
                %>
            </tbody>
        </table>
    </body>
</html>
