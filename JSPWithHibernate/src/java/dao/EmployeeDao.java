
package dao;
import java.util.*;
import model.Employee;
import org.hibernate.cfg.*;
import org.hibernate.*;
public class EmployeeDao {
    
    Configuration cfg;
    SessionFactory factory;
    Session s;
    Transaction tr;
    public EmployeeDao(){
        cfg=new  Configuration().configure("hibernate.cfg.xml");
        factory=cfg.buildSessionFactory();
    }
    
    public List<Employee>GetEmployees(){
        s=factory.openSession();
        List<Employee>lst=s.createQuery("from Employee").list();
        s.close();
        return lst;
    }
    public Employee GetEmployee(int id)
    {
        s=factory.openSession();
        Employee e=(Employee)s.get(Employee.class,id);
        return e;
    }
}
