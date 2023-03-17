<%-- 
    Document   : Employee_display
    Created on : Feb 22, 2023, 12:46:09 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="Model.Employee_data,dao.Employee_data_dao,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post">
            <table>
                <thead>
                    <tr>
                        <th>Emp_id</th>
                        <th>Emp_name</th>
                        <th>Designation</th>
                        <th>Salary</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        Employee_data_dao edd= new Employee_data_dao();
                        List<Employee_data>lst = edd.GetEmployees();
                        for(Employee_data e:lst){
                            %>
                            <tr>
                                <td><%=e.getEmp_Id()%></td>
                                <td><%=e.getEmp_name()%></td>
                                <td><%=e.getDesignation()%></td>
                                <td><%=e.getSalary()%></td>
                            </tr>
                            <%
                        }
                    %>
                </tbody>
            </table>
        </form>
    </body>
</html>
