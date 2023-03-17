<%@include file="header.jsp" %>
<div class="container">
    <h1> Contact</h1>
</div>
<div class="container">
    <div class="form-group">
        <div class="panel-body">

            <table>
                <tr>
                    <th>Name</th>
                    <th><input class="form-control" type="text" name="txtname" /></th>
                </tr>
                <tr>
                    <th>Email-id</th>
                    <th><input class="form-control" type="text" name="txtemailid"  /></th>
                </tr>
                <tr>
                    <th>City</th>
                    <th><input class="form-control" type="text" name="txtcity" /></th>
                </tr>
                <tr>
                    <th><input class="form-control btn btn-warning" type="submit" value="submit" /></th>
                </tr>
            </table>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>