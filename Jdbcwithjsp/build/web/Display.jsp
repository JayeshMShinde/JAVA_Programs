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
        <a href="Addstudent.jsp">Add Student</a>
        <%
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from tblStudent");
        %>
        <h1>ALL STUDENT</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Roll No</th>
                    <th>Name</th>
                    <th>English</th>
                    <th>Maths</th>
                    <th>Science</th>                   
                </tr>
            </thead>
            <tbody>
                <%
                    while(rs.next()){
                        int r = rs.getInt("rno");
                        String n = rs.getString("name");
                        float e = rs.getFloat("english");
                        float m = rs.getFloat("maths");
                        float s = rs.getFloat("science");
                        %>
                        <tr>
                            <td><%=r %></td>
                            <td><%=n %></td>
                            <td><%=e %></td>
                            <td><%=m %></td>
                            <td><%=s %></td>
                        </tr>
                        <%
                                
                    }
                %>
            </tbody>
        </table>
    </body>
</html>
