<%@include file="header.jsp" %>
<%
    ResultSet rcity = st.executeQuery("select * from city_s");
%>
<div class="container">
    <form method="POST">
        <table>
            <tr>
                <th>
                    Employee ID:
                </th>
                <th>
                    <input class="form-control" type="text" name="txteid"/>
                </th>
            </tr>
            <tr>
                <th>
                    Employee Name:
                </th>
                <th>
                    <input class="form-control" type="text" name="txtempname"/>
                </th>
            </tr>
            <tr>
                <th>
                    Email_Id:
                </th>
                <th>
                    <input class="form-control" type="text" name="txtemail"/>
                </th>
            </tr>
            <tr>
                <th>
                    Mobile_no:
                </th>
                <th>
                    <input class="form-control" type="number" name="txtmobile"/>
                </th>
            </tr>
            <tr>
                <th>
                    City:
                </th>
                <th>
                    <select name="ddcity"  class="form-control">
                        <option selected disabled>Select City</option>
                        <%
                            while(rcity.next()){
                                int cid = rcity.getInt("city_id");
                                String cnm = rcity.getString("city_name");
                                %>
                                <option value="<%=cid%>"><%=cnm%></option>
                                <%
                            }
                        %>
                    </select>
                </th>
            </tr>
            <%
                ResultSet rdes = st.executeQuery("select * from desegnation");
            %>
            <tr>
                <th>
                    Designation:
                </th>
                <th>
                    <select name="desdd" class="form-control">
                        <option selected disabled>Select Designation</option>
                        <%
                            while(rdes.next()){
                                int desid = rdes.getInt("des_id");
                                String desnm = rdes.getString("des_name");
                            %>
                            <option value="<%=desid%>"><%=desnm%></option>
                            <%
                            }
                        %>
                    </select>
                </th>
            </tr>

            <tr>
                <th>
                    Salary:
                </th>
                <th>
                    <input class="form-control" type="text" name="txtsal"/>
                </th>
            </tr>
            <tr>
                <th>
                    <input class="form-control btn btn-success" type="Submit" value="Submit"/>
                </th>
            </tr>
        </table>
    </form>
    <%
           if(request.getMethod().equals("POST")){
               int eid = Integer.parseInt(request.getParameter("txteid"));
               String enm = request.getParameter("txtempname");
               String email = request.getParameter("txtemail");
               int mono = Integer.parseInt(request.getParameter("txtmobile"));
               int cid = Integer.parseInt(request.getParameter("ddcity"));
               int desid = Integer.parseInt(request.getParameter("desdd"));
               int sal = Integer.parseInt(request.getParameter("txtsal"));
               
               int cnt = st.executeUpdate("insert into Employee_s values(" + eid + ",'" + enm + "','"+email+"',"+mono+","+cid+","+desid+","+sal+")");
               if (cnt > 0) {
                   out.println("<h2>Data Added Successfully</h2>");
               } 
               else 
               {
                   out.println("<h2>Error....!!!!</h2>");
               }
               
           }
    %>
    <hr>
    <%
        ResultSet rs = st.executeQuery("Select emp_id,emp_name,email,mobile_no,city_name,des_name,salary from Employee_s e join city_s c on c.city_id=e.city_id join desegnation d on d.des_id=e.des_id");
    %>
    <div class="col-md-9">
        <table border="1"cellpadding="5" cellspacing="1" class="table table-bordered">
            <thead style="background:greenyellow">
                <tr>
                    <th>Employee_id</th>
                    <th>Employee_Name</th>
                    <th>Email_Id</th>
                    <th>Moblie_No</th>
                    <th>City</th>
                    <th>Designation</th>
                    <th>Salary</th>
                </tr>
            </thead>
            <tbody>
                    <%
                    while (rs.next()) {
                        int eid = rs.getInt("emp_id");
                        String enm = rs.getString("emp_name");
                        String email = rs.getString("email");
                        int mobileno = rs.getInt("Mobile_no");
                        String cnm = rs.getString("city_name");
                        String desnm = rs.getString("des_name");
                        int sal = rs.getInt("Salary");
                %>
                <tr>
                    <td><%=eid%></td>
                    <td><%=enm%></td>
                    <td><%=email%></td>
                    <td><%=mobileno%></td>
                    <td><%=cnm%></td>
                    <td><%=desnm%></td>
                    <td><%=sal%></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</div>
<%@include file="footer.jsp" %>