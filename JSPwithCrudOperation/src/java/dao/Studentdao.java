
package dao;

import Model.Student;
import java.sql.*;
import java.util.*;
public class Studentdao {
    
    Connection con;
    Statement st;
    ResultSet rs;
    public Studentdao(){
        try{
             Class.forName("oracle.jdbc.OracleDriver");
             con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
             
        }
        catch(Exception e){
            System.out.println("Exception=>"+e.getMessage());
        }
    }
    public String AddStudent(Student s){
       String msg="";
               
       try{
           st = con.createStatement();
           int cnt = st.executeUpdate("insert into tblstudent(rno,name,english,maths,science) values("+s.getRno()+",'"+s.getName()+"',"+s.getEnglish()+","+s.getMaths()+","+s.getScience()+")");
           if(cnt>0){
               msg = "Student Added Succesfully";
           }
           else{
               msg = "Error! Please try Again";
           }
       }
       catch(Exception e){
           msg = ("Exception=>"+e.getMessage());

       }
       return msg;
    }
    public String UpdateStudent(Student s){
        String msg="";
        try{
            st = con.createStatement();
            int cnt = st.executeUpdate("Update tblstudent set name='"+s.getName()+"',english="+s.getEnglish()+",maths = "+s.getMaths()
                    +",science = "+s.getScience()+" where rno = "+s.getRno());
            if(cnt>0){
                msg = "Student Updated Succesfully";
                
            }
            else{
                msg = "Error! Please Try Agian";
            }
        }
        catch(Exception e){
            msg = ("Exception=>"+e.getMessage());
        }
        return msg;
    }
    public String DeleteStudent(int rno){
        String msg = "";
        try{
            st = con.createStatement();
            int cnt = st.executeUpdate("delete from tblstudent where rno = "+rno);
            if(cnt>0){
                msg = "Student Deleted Succesfully";
                
            }
            else{
                msg = "Error! Please Try Agian";
            }
        }
        catch(Exception e){
            msg = ("Exception=>"+e.getMessage());
        }
        return msg;
    }
    public List<Student>GetStudents(){
        List<Student>lst=new ArrayList<>();
        try{
            st = con.createStatement();
            rs = st.executeQuery("Select rno,name,english,maths,science from tblstudent");
            while(rs.next()){
                Student stud = new Student(rs.getInt("rno"), rs.getString("name"), rs.getFloat("english"), rs.getFloat("maths"), rs.getFloat("Science"));
                lst.add(stud);
            }
        }
        catch(Exception e){
            System.out.println("Exception => "+e.getMessage());
        }
        return lst;
    }
    
    public Student GetStudent(int rno){
        Student s1 = null;
        try{
            st = con.createStatement();
            rs = st.executeQuery("Select rno,name,english,maths,science from tblstudent where rno = "+rno);
            while(rs.next()){
                s1 = new Student(rs.getInt("rno"), rs.getString("name"), rs.getFloat("english"), rs.getFloat("maths"), rs.getFloat("Science"));
               
            }
        }
        catch(Exception e){
            System.out.println("Exception => "+e.getMessage());
        }
        return s1;
    }
    
}
