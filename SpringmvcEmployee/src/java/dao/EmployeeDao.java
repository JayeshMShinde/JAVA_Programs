package dao;

import java.util.*;
import java.sql.*;
import model.City;
import model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class EmployeeDao {
    
    JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    
    public void Addemployee(Employee e){
        template.execute("insert into tblemployee values("+e.getEmpid()+",'"+e.getEmpname()+"',"+e.getCityid()+",'"+e.getCitynm()+"','"+e.getDesignation()+"',"+e.getSalary()+")");
    }
    
    public List<Employee>GetEmployees(){
        List<Employee>lst=template.query("select empid,empname,gender,c.city_id,c.city_name,desgn,salary from tblemployee e join tbl_city c on e.city_id=c.city_id", new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int i) throws SQLException {
                   Employee e = new Employee(rs.getInt("empid"),rs.getString("empname"), rs.getString("gender"), rs.getInt("city_id"), rs.getString("city_name"), rs.getString("desgn"), rs.getFloat("salary"));
                   return e;
            }
        });
        return lst;
    }
    
    public List<City>GetCities(){
        List<City>lstc=template.query("select * from tbl_city",new RowMapper<City>() {
            @Override
            public City mapRow(ResultSet rs, int i) throws SQLException {
                   City c = new City(rs.getInt("city_id"),rs.getString("city_name"));            
                   return c;
            }
        });
        return lstc;
    }
    
    public int nextEmpid(){
        List<Employee>lsteid = template.query("select max(empid) empid from tblemployee",new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int i) throws SQLException {
                Employee e = new Employee(rs.getInt("empid"),"", "", 0, "", "", 0);
                return e;
            }
        });
        if(lsteid.size()>0){
            return lsteid.get(0).getEmpid()+1;
        }
        else{
            return 1;
        }
    }
    
}
