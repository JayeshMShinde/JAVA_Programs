package dao;
import java.sql.*;
import java.util.*;
import model.City;
import model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDao {
    
    JdbcTemplate Template;

    public JdbcTemplate getTemplate() {
        return Template;
    }

    public void setTemplate(JdbcTemplate Template) {
        this.Template = Template;
    }
    
    public void AddStudent(Student st){
        Template.execute("insert into tblstudent values("+st.getRno()+",'"+st.getName()+"',"+st.getEnglish()+","+st.getMaths()+","+st.getScience()+",'"+st.getGender()+"',"+st.getCity_id()+")");
    }
    public List<Student>GetStudents(){
        
        List<Student>lst=Template.query("select rno,name,english,maths,science,gender,c.city_id,c.city_name from tblstudent s join tblcities c  on s.city_id=c.city_id", new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student s = new Student(rs.getInt("rno"), rs.getString("name"), rs.getFloat("english"), rs.getFloat("maths"), rs.getFloat("science"),rs.getString("gender"),rs.getInt("city_id"),rs.getString("city_name"));
                return s;
            }
        });
        return  lst;
    }

public List<City>GetCities(){
    List<City>lst=Template.query("select * from tblcities",new RowMapper<City>() {
        @Override
        public City mapRow(ResultSet rs, int i) throws SQLException {

            City c=new City(rs.getInt("city_id"),rs.getString("city_name"));
            return c;
        }
    });
    return lst;
}    
    public int NextRollno(){
        
        List<Student>lst=Template.query("select max(rno) rno from tblstudent", new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student s = new Student(rs.getInt("rno"),"",0,0,0,"",0,"");
                return s;
            }
        });
        if(lst.size()>0){
            return lst.get(0).getRno()+1;
        }
        else{
            
            return 1;
        }
    }
}   

