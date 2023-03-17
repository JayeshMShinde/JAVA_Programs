/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Student;
import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Lenovo
 */
public class StudentDao {
    JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    
    public void Addstudent(Student s){
        template.execute("insert into tblstudent values("+s.getRno()+",'"+s.getName()+"',"+s.getEnglish()+","+s.getMaths()+","+s.getScience()+")");
    }
    
    public void UpdateStudent(Student s){
        template.execute("Update tblstudent set name='"+s.getName()+"',english="+s.getEnglish()+",maths="+s.getMaths()+",science="+s.getScience()+"where rno="+s.getRno()+")");
    }
    
    public void DeleteStudent(int rno){
        template.execute("Delete from tblstudent where rno="+rno);
    }
    
    public List<Student>GetStudents(){
        List<Student>lst= template.query("Select * from tblstudent", new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                  Student s = new Student(rs.getInt("rno"),rs.getString("name"), rs.getFloat("english"), rs.getFloat("maths"), rs.getFloat("science"));
                  return s;
            }
        } );
        return lst;
    }
    public Student GetStudent(int rno){
        List<Student>lst= template.query("Select * from tblstudent where rno="+rno, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                  Student s = new Student(rs.getInt("rno"),rs.getString("name"), rs.getFloat("english"), rs.getFloat("maths"), rs.getFloat("science"));
                  return s;
            }
        } );
        return lst.get(0);
    } 
}

