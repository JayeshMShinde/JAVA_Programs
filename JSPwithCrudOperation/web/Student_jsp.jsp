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
        <div class="container">
            <form method="POST">
                <table class="form-group">
                    <tr>
                        <th>
                            Roll No:
                        </th>
                        <th><input class="form-control" type="text" name="txtrno"></th>
                    </tr>

                    <tr>
                        <th>
                            Name:
                        </th>
                        <th><input class="form-control" type="text" name="txtname"></th>
                    </tr>

                    <tr>
                        <th>
                            English:
                        </th>
                        <th><input  class="form-control" type="text" name="txteng"></th>
                    </tr>

                    <tr>
                        <th>
                            Maths:
                        </th>
                        <th><input class="form-control" type="text" name="txtmath"></th>
                    </tr>

                    <tr>
                        <th>
                            Science:
                        </th>
                        <th><input  class="form-control" type="text" name="txtsci"></th>
                    </tr>

                    <tr>
                        <th rowspan="2"><input class="form-control btn-warning" type="submit" value="Submit"></th>
                    </tr>
                </table>
            </form>
        </div>
        <%
            Studentdao sdao = new Studentdao();
            if (request.getMethod().equals("POST")) {
                int r = Integer.parseInt(request.getParameter("txtrno"));
                String n = request.getParameter("txtname");
                float e = Float.parseFloat(request.getParameter("txteng"));
                float m = Float.parseFloat(request.getParameter("txtmath"));
                float s = Float.parseFloat(request.getParameter("txtsci"));
                Student stud = new Student(r, n, e, m, s);
                String msg = sdao.AddStudent(stud);
                out.println("<h4>" + msg + "</h4>");
            }
            List<Student> lst = sdao.GetStudents();
        %>
        <hr/>
        <div class="container">
            <h1>Student Details</h1>
            <table cellpadding="5" cellspacing="1" class="table table-bordered">
                <thead style="background-color: lightgray">
                    <tr>
                        <th>Roll No</th>
                        <th>Name</th>
                        <th>English</th>
                        <th>Maths</th>
                        <th>Science</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (Student s : lst) {
                    %>
                    <tr>
                        <td><%=s.getRno()%></td>
                        <td><%=s.getName()%></td>
                        <td><%=s.getEnglish()%></td>
                        <td><%=s.getMaths()%></td>
                        <td><%=s.getScience()%></td>
                        <td>
                            <a href="Edit.jsp?rno=<%=s.getRno()%>" class="fas btn-default">&#xf304;</a>
                            &nbsp;
                            &nbsp;
                            <a href="Delete.jsp?rno=<%=s.getRno()%>" class="fas btn-default">&#xf2ed;</a>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </div>
    </body>
</html>
