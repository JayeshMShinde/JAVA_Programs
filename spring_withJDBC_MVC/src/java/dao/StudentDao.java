package dao;

import model.City;
import model.Student;
import java.util.*;
import java.sql.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDao {
    JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    
    public void Addstudent(Student st){
        template.execute("insert into tbl_student values("+st.getRno()+",'"+st.getName()+"','"+st.getGender()+"','"+st.getCity_nm()+"',"+st.getCity_id()+","+st.getEnglish()+","+st.getScience()+","+st.getMaths()+")");
    }
    
    public List<Student>GetStudent(){
        List<Student>lst = template.query("select rno,name,gender,c.city_id,c.city_name,english,science,maths from tbl_student ts join tbl_city c on ts.city_id=c.city_id", new RowMapper<>(Student) {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student s = new Student(rs.getInt("rno"), rs.getString("name"), rs.getString("gender"), rs.getInt("city_id"), rs.getString("city_name"), i, i, i)
                //To change body of generated methods, choose Tools | Templates.
            }
        });
        return lst;
    }
}
