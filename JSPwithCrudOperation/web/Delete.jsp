<%-- 
    Document   : Delete
    Created on : Feb 20, 2023, 7:26:09 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.Studentdao,Model.Student,java.util.*" %>

<%
            Studentdao sdao = new Studentdao();
            int rn  = Integer.parseInt(request.getParameter("rno"));
            Student std = sdao.GetStudent(rn);
            sdao.DeleteStudent(rn);
            response.sendRedirect("Student_jsp.jsp");
        %>