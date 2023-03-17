<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <link href='<c:url value="/resources/css/bootstrap.min.css"></c:url>' rel="stylesheet">
        <script src='<c:url value="/resources/js/jquery.min.js"></c:url>'></script>
        <script src='<c:url value="/resources/js/bootstrap.min.js"></c:url>'></script>
        <script>
            $(document).ready(function(){
                ClearData();
                GetAll();
                $("#btnsumbit").click(function(){
                    AddStudent();
                })
                $("#btnupdate").click(function(){
                    UpdateStudent();
                })
                $("#btnclear").click(function(){
                    ClearData();
                })
            })
            
            function GetAll(){
                $.ajax({
                    url:'/Spring_MVC_JSON_pratice/Studentlist',
                    method:'get',
                    contentType:'application/json',
                    success:function(resp){
                        console.log(resp);
                        $("#tbldata").empty();
                        $.each(resp,function(i,d){
                            $("#tbldata").append("<tr><td>"+d.rno+"</td><td>"+d.name+"</td><td>"+d.english+"</td><td>"+d.maths+"</td><td>"+d.science+"</td><td><input type='button' value='View' onclick='ViewStudent("+d.rno+")' /> &nbsp;<input type='button' value='Delete' onclick='DeleteStudent("+d.rno+")' /></td></tr>");
                            
                        });
                     }
                });
            }
            function AddStudent(){
                var st={"rno":$("#txtrno").val(),"name":$("#txtname").val(),"english":$("#txtenglish").val(),"maths":$("#txtmaths").val(),"science":$("#txtscience").val()};
                $.ajax({
                    url:'/Spring_MVC_JSON_pratice/addstudent',
                    method:'post',
                    data:(st),
//                    contentType:'application/json',
                    success:function(resp){
                        alert("Added Successfully");
                        GetAll();
                        ClearData();
                    }
                }); 
            }
            function UpdateStudent(){
                var st={"rno":$("#txtrno").val(),"name":$("#txtname").val(),"english":$("#txtenglish").val(),"maths":$("#txtmaths").val(),"science":$("#txtscience").val()};
                $.ajax({
                    url:'/Spring_MVC_JSON_pratice/updatestudent',
                    method:'post',
                    data:(st),
//                    contentType:'application/json',
                    success:function(resp){
                        alert("updated Successfully");
                        GetAll();
                        ClearData();
                    }
                }); 
            }
            function DeleteStudent(id){
                $.ajax({
                    url:'/Spring_MVC_JSON_pratice/deletestudent/'+id,
                    method:'get',
                    success:function(resp){
                        alert("Deleted Successfully");
                        GetAll();
                        ClearData();
                    }
                }); 
            }
            function ViewStudent(id){
                $.ajax({
                    url:'/Spring_MVC_JSON_pratice/fetchstudent/'+id,
                    method:'get',
                    contentType:'application.json',
                    success:function(resp){
                        console.log(resp);
                        $("#txtrno").val(resp.rno);
                        $("#txtname").val(resp.name);
                        $("#txtenglish").val(resp.english);
                        $("#txtmaths").val(resp.maths);
                        $("#txtscience").val(resp.science);
                        $("#btnsumbit").hide();
                        $("#btnupdate").show();
                    
                    }
                })
            }
            function ClearData(){
                $("#txtrno").val("");
                $("#txtname").val("");
                $("#txtenglish").val("");
                $("#txtmaths").val("");
                $("#txtscience").val("");
                $("#btnsumbit").show();
                $("#btnupdate").hide();
                
                
            }
        </script>
    </head>

    <body>
        
        <div class="container">
        <h2>Student</h2>
        <div class="col-md-6">
            <div class="form-group">
                <table> 
                    <tr>
                        <th>Roll NO:</th>
                        <th><input class="form-control" type="text" id="txtrno" /></th>
                    </tr>
                    
                    <tr>
                        <th>Name</th>
                        <th><input class="form-control" type="text" id="txtname" /></th>
                    </tr>
                    <tr>
                        <th>English</th>
                        <th><input class="form-control" type="text" id="txtenglish" /></th>
                    </tr>
                    
                    <tr>
                        <th>Maths</th>
                        <th><input class="form-control" type="text" id="txtmaths" /></th>
                    </tr>
                    
                    <tr>
                        <th>Science</th>
                        <th><input class="form-control" type="text" id="txtscience" /></th>
                    </tr>
                    <tr>
                        <th>
                            <input class=" btn btn-primary" type="submit" id="btnsumbit" value="Submit" />&nbsp;
                            <input class=" btn btn-info" type="button" id="btnupdate" value="Update" />&nbsp;
                            <input class=" btn btn-default" type="button" id="btnclear" value="Clear" />
                        </th>
                    </tr>
                </table>
            </div>
        </div>
            <div class="container">
        <div class="col-md-6">
            <table class="table table-bordered table-hover table-striped">
                <thead>
                    <tr>
                        <th>Roll No.</th>
                        <th>Student Name</th>
                        <th>English</th>
                        <th>Maths</th>
                        <th>Science</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody id="tbldata"></tbody>
            </table>
        </div>
                </div>
            </div>
    </body>
</html>
