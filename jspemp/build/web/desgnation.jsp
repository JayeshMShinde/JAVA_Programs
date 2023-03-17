<%@include file="header.jsp" %>
<div class="container">
    <form method="POST">
    <table>
        <tr>
            <th>
                Designation ID:
            </th>
            <th>
                <input class="form-control" type="text" name="txtdesid"/>
            </th>
        </tr>
        <tr>
            <th>
                Designation Name:
            </th>
            <th>
                <input class="form-control" type="text" name="txtdesname"/>
            </th>
        </tr>
        <tr>
            <th>
                <input class="form-control btn btn-success" type="Submit" value="Submit"/>
            </th>
        </tr>
    </table>
    </form>
    <%        if (request.getMethod().equals("POST")) {
            int desid = Integer.parseInt(request.getParameter("txtdesid"));
            String desnm = request.getParameter("txtdesname");
            int cnt = st.executeUpdate("insert into DESEGNATION values(" + desid + ",'" + desnm + "')");
            if (cnt > 0) {
                out.println("<h2>Data Added Successfully</h2>");
            } else {
                out.println("<h2>Error....!!!!</h2>");
            }
        }
    %>
    <hr>
    <%
        ResultSet rs = st.executeQuery("Select * from DESEGNATION");
    %>
    <div class="col-md-9">
        <table border="1"cellpadding="5" cellspacing="1" class="table table-bordered">
            <thead style="background:greenyellow">
                <tr>
                    <th>Designation_Id</th>
                    <th>Designation_Name</th>
                </tr>
            </thead>
            <tbody>
                <%
                    while (rs.next()) {
                        int desgid = rs.getInt("des_id");
                        String desgnm = rs.getString("des_name");
                %>
                <tr>
                    <td><%=desgid%></td>
                    <td><%=desgnm%></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</div>
<%@include file="footer.jsp" %>