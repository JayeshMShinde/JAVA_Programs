<%@include file="header.jsp" %>
<%
      ResultSet rstate = st.executeQuery("Select * from state_s");
      
    %>
<div class="container">
    <form method="POST">
        <div class="col-md-4">
            <div class="form-group">
                <label>State</label>
                                <select name="ddstate" class="form-control">
                    <option selected disabled>Select State  </option>
                    <%
                        while(rstate.next())
                        {
                            int sid=rstate.getInt("state_id");
                            String sname=rstate.getString("state_name");
                        %>
                        <option value="<%=sid%>"><%=sname%></option>
                        <%
                        
                        }
                        %>
                        
                </select>

            </div>
    

        
        <div class="form-group">
            <label>City ID:</label>
                <input class="form-control" type="text" name="txtcid"/>
        </div>
           <div class="form-group">
            <label>
                City Name:
            </label>
            
                <input class="form-control" type="text" name="txtcname"/>
            
        </div>
        <div class="form-group">
                <input class="form-control btn btn-success" type="Submit" value="Submit"/>
 </div> 
    </form>
</div>

<%        if (request.getMethod().equals("POST")) {
            int cid = Integer.parseInt(request.getParameter("txtcid"));
            String cnm = request.getParameter("txtcname");
            int sid = Integer.parseInt(request.getParameter("ddstate"));
            int cnt = st.executeUpdate("insert into city_s values(" + cid + ",'" + cnm + "',"+sid+")");
            if (cnt > 0) {
                out.println("<h2>Data Added Successfully</h2>");
            } else {
                out.println("<h2>Error....!!!!</h2>");
            }
        }
    %>
    <hr>
    <%
        ResultSet rs = st.executeQuery("Select city_id,city_name,s.state_id,state_name  from city_s c join state_s s on s.state_id=c.state_id");
    %>
    <div class="col-md-9">
        <table border="1"cellpadding="5" cellspacing="1" class="table table-bordered">
            <thead style="background:greenyellow">
                <tr>
                    <th>City_id</th>
                    <th>City_Name</th>
                    <th>State </th>
                </tr>
            </thead>
            <tbody>
                <%
                    while (rs.next()) {
                        int ctid = rs.getInt("city_id");
                        String ctnm = rs.getString("city_name");
                        String stname = rs.getString("state_name");
                %>
                <tr>
                    <td><%=ctid%></td>
                    <td><%=ctnm%></td>
                    <td><%=stname%></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</div>
<%@include file="footer.jsp" %>