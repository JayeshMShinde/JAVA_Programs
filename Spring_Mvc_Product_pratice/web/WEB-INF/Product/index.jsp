<%-- 
    Document   : newjspindex
    Created on : Mar 1, 2023, 4:18:21 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <a href="/Spring_Mvc_Product_pratice/add">Add Product</a>
        <hr>                           
        <table border="1">
            <thead>
                <tr>
                    <th>Product_Id</th>
                    <th>Product_Name</th>
                    <th>Rate</th>
                    <th>Tax</th>
                    <th>Stock_Quantity</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="p" items="${Product}">
                    <tr>
                        <td>${p.product_id}</td>
                        <td>${p.product_name}</td>
                        <td>${p.rate}</td>
                        <td>${p.tax}</td>
                        <td>${p.stock_quan}</td>
                        <td>
                            <c:choose>
                            <c:when test="${p.stock_quan >= 0 and p.stock_quan <= 10}">
                                Limited Stock
                            </c:when>
                            <c:when test="${p.stock_quan < 0}">
                                Invalid
                            </c:when>
                            <c:otherwise>
                                Plenty Of Stock
                            </c:otherwise>
                        </c:choose>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
      </body>
</html>
