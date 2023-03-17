<%-- 
    Document   : AddProduct
    Created on : Mar 1, 2023, 4:41:20 PM
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
        <h1>ADD PRODUCT</h1>
        
        <form:form action="save" method="post"  >
            <table>
                <tr>
                    <th>Product Id</th>
                    <th><form:input path="product_id"></form:input></th>
                </tr>
                <tr>
                    <th>Product Name</th>
                    <th><form:input path="product_name"></form:input></th>
                </tr>
                <tr>
                    <th>Rate</th>
                    <th><form:input path="rate"></form:input></th>
                </tr>
                <tr>
                    <th>Tax</th>
                    <th><form:input path="tax"></form:input></th>
                </tr>
                <tr>
                    <th>Stock Quantity</th>
                    <th><form:input path="stock_quan" ></form:input></th>
                </tr>
                
                <tr>
                    <th><input type="Submit" value="Submit"/></th>
                </tr>
            </table>
        </form:form>
    </body>
</html>
