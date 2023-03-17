
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*;" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" />
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
        <style>
            body {
                background-color: white;
                color: black;
            }

            .dark-mode{
                background-color: black;
                color: whitesmoke;
            }
        </style>
        <script>
            function Darkfun() {
                var element = document.body;
                element.classList.toggle("dark-mode");
            }
            
        </script>
    </head>
    <body>
        <%
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
            Statement st = con.createStatement();
        %>
        <div class="container">
            <div class="nav navbar-inverse" style="width:100%">
                <ul class ="nav navbar-nav">
                    <li><a href="header.jsp" style="font:inherit">CIIT</a></li>
                </ul>
                <ul class ="nav navbar-nav navbar-right">
                    <li><a onclick="Darkfun()" style="color:greenyellow;width:45px"><i class='far fa-lightbulb' ></i></a></li>
                </ul>
                <ul class ="nav navbar-nav navbar-right">
                    <li><a href="#" style="color:greenyellow;width:80px">LOGIN</a></li>
                </ul>
                
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-3" style="min-height: 500px;border-right: 1px solid gray;">
                    <ul class="list-group">
                        <li class="list-group-item">
                            <a href="dashboard.jsp" class="btn btn-primary" style="width:100%">Dashboard</a>
                        </li>
                        <li class="list-group-item">
                            <a href="state.jsp" class="btn btn-primary" style="width:100%">State</a>
                        </li>
                        <li class="list-group-item">
                            <a href="city.jsp" class="btn btn-primary" style="width:100%">City</a>
                        </li>
                        <li class="list-group-item">
                            <a href="desgnation.jsp" class="btn btn-primary" style="width:100%">Designation</a>
                        </li>
                        <li class="list-group-item">
                            <a href="Employee.jsp" class="btn btn-primary" style="width:100%">Employee</a>
                        </li>
                    </ul>
                </div>
                <div class="col-md-9">
                    <div style="min-height: 500px;width:100%">

