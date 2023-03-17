<%-- 
    Document   : AddStudent
    Created on : Feb 28, 2023, 4:56:57 PM
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
        <h1>Student Add</h1>
        <form:form action="save" method="post">
            <table>
                <tr>
                    <td>Roll No.</td>
                    <td><form:input path="rno" ></form:input></td>
                </tr>
                <tr>
                    <td>Student Name</td>
                    <td><form:input path="name"></form:input></td>
                </tr>
                
                <tr>
                    <td>Gender</td>
                    <td>
                    <form:radiobutton path="gender" value="Male"></form:radiobutton>Male
                    <form:radiobutton path="gender" value="Female"></form:radiobutton>Female
                    </td>
                </tr>
                
                <tr>
                    <td>City</td>
                    <td>
                    <form:select path="city_id">
                        <form:option value="0" selected="true" disabled="true" >Select City</form:option>
                        <form:options items="${cities}" itemLabel="city_name" itemValue="city_id"></form:options>
                    </form:select>
                    </td>
                </tr>
                <tr>
                    <td>English</td>
                    <td><form:input path="english"></form:input></td>
                </tr>
                <tr>
                    <td>Maths</td>
                    <td><form:input path="maths"></form:input></td>
                </tr>
                <tr>
                    <td>Science</td>
                    <td><form:input path="science"></form:input></td>
                </tr>
                <tr>
                    <td><input type="Submit" value="Submit"/></td>
                </tr>
                
            </table>
        </form:form>
    </body>
</html>
