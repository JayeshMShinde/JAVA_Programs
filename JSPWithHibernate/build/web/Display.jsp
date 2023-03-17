<%-- 
    Document   : Display
    Created on : Feb 21, 2023, 4:37:40 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="model.Employee,dao.EmployeeDao,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>Employee Id</th>
                    <th>Employee Name</th>
                    <th>Designation</th>
                    <th>Salary</th>
                </tr>
            </thead>
            <tbody>
                
        <%
            EmployeeDao edao=new EmployeeDao();
            List<Employee>lst=edao.GetEmployees();
            for(Employee e:lst)
            {
            %>
            <tr>
                <td><%=e.getEmployee_id() %></td>
                <td><%=e.getEmployee_name()%></td>
                <td><%=e.getDesignation()%></td>
                <td><%=e.getEmployee_id() %></td>
            </tr>
            <%
            }
            %>
            </tbody>
        </table>

            </body>
</html>
