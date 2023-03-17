<%-- 
    Document   : Addemployee
    Created on : Mar 8, 2023, 3:48:14 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Employee</h1>
        <form:form action="save" method="POST">
            <table>
                <tr>
                    <td>Employee_id</td>
                    <td><form:input path="empid"></form:input></td>
                </tr>
                
                <tr>
                    <td>Employee_name</td>
                    <td><form:input path="empname"></form:input></td>
                </tr>
                
                
                <tr>
                    <td>gender</td>
                    <td>
                        <form:radiobutton path="gender" value="Male"></form:radiobutton> Male                                          <form:radiobutton path="gender" value="Male"></form:radiobutton>
                        <form:radiobutton path="gender" value="Female"></form:radiobutton>Female
                    </td>
                </tr>
                
                <tr>
                    <td>Employee_id</td>
                    <td><form:input path="empid"></form:input></td>
                </tr>
                
                <tr>
                    <td>Employee_id</td>
                    <td><form:input path="empid"></form:input></td>
                </tr>
                
                <tr>
                    <td>Employee_id</td>
                    <td><form:input path="empid"></form:input></td>
                </tr>
                
            </table>
        </form:form>
    </body>
</html>
