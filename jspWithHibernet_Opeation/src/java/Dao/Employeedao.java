/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.*;
import Model.Employee;
import org.hibernate.cfg.*;
import org.hibernate.*;

public class Employeedao {
    
    Configuration cfg;
    SessionFactory factory;
    Session s;
    Transaction tr;
    public Employeedao(){
        cfg =  new Configuration().configure("hibernate.cfg.xml");
        factory = cfg.buildSessionFactory();
    }
    public List<Employee>GetEmployees(){
        s = factory.openSession();
        List<Employee>lst = s.createQuery("from Employee").list();
        s.close();
        return lst;
    }
    
    public Employee GetEmployee(int id){
        s = factory.openSession();
        Employee e= (Employee)s.get(Employee.class, id);
        return e;
    }
}
