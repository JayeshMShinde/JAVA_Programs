<%-- 
    Document   : DisplayEmp
    Created on : Feb 21, 2023, 5:41:30 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="Model.Employee,Dao.Employeedao,java.util.*"%>
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
                    <th>Employee_id</th>
                    <th>Employee_name</th>
                    <th>Designation</th>
                    <th>Salary</th>
                </tr>
            </thead>
            <tbody>
                <%
                    Employeedao edao=new Employeedao();
                    List<Employee>lst=edao.GetEmployees();
                    for(Employee e:lst){
                        %>
                        <tr>
                            <td><%=e.getEmployee_id()%></td>
                            <td><%=e.getEmployee_name()%></td>
                            <td><%=e.getDesignation()%></td>
                            <td><%=e.getSalary()%></td>
                            
                        </tr>
                        <%
                    }
                    
                %>
            </tbody>
        </table>
    </body>
</html>
