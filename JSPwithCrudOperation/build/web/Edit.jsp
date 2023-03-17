<%@page contentType="text/html" pageEncoding="UTF-8" import="Model.Student,dao.Studentdao,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" />
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
    </head>
    <body>
        <%
            Studentdao sdao = new Studentdao();
            int rn = Integer.parseInt(request.getParameter("rno"));
            Student std = sdao.GetStudent(rn);
        %>
        <div class="container">
            <form method="POST">
                <table class="form-group">
                    <tr>
                        <th>
                            Roll No:
                        </th>
                        <th><input class="form-control" type="text" name="txtrno" value="<%=std.getRno()%>"></th>
                    </tr>

                    <tr>
                        <th>
                            Name:
                        </th>
                        <th><input class="form-control" type="text" name="txtname" value="<%=std.getName()%>"></th>
                    </tr>

                    <tr>
                        <th>
                            English:
                        </th>
                        <th><input  class="form-control" type="text" name="txteng" value="<%=std.getEnglish()%>"></th>
                    </tr>

                    <tr>
                        <th>
                            Maths:
                        </th>
                        <th><input  class="form-control" type="text" name="txtmath"value="<%=std.getMaths()%>"></th>
                    </tr>

                    <tr>
                        <th>
                            Science:
                        </th>
                        <th><input class="form-control" type="text" name="txtsci" value="<%=std.getScience()%>"></th>
                    </tr>
                    <tr>
                        <th>
                            <input class="form-control btn-warning" type="Submit" value="Update">
                            &nbsp;
                            <a href="Student_jsp.jsp" class="form-control btn btn-primary">Back</a>
                        </th>
                    </tr>
                </table>
                <%

                    if (request.getMethod().equals("POST")) {
                        int r = Integer.parseInt(request.getParameter("txtrno"));
                        String n = request.getParameter("txtname");
                        float e = Float.parseFloat(request.getParameter("txteng"));
                        float m = Float.parseFloat(request.getParameter("txtmath"));
                        float s = Float.parseFloat(request.getParameter("txtsci"));
                        Student stud = new Student(r, n, e, m, s);
                        String msg = sdao.UpdateStudent(stud);
                        //out.println("<h4>" + msg + "</h4>");
                        response.sendRedirect("Student_jsp.jsp");
                    }

                %>
            </form>
        </div>
    </body>
</html>
