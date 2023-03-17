/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.*;
import Model.Employee_data;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class Employee_data_dao {
    
    Configuration cfg;
    SessionFactory  sf;
    Session s;
    Transaction t;
    
    public Employee_data_dao(){
        cfg = new Configuration().configure("hibernate.cfg.xml");
        sf = cfg.buildSessionFactory();
    }
    
    public List<Employee_data>GetEmployees(){
        s= sf.openSession();
        List<Employee_data>lst = s.createQuery("from Employee_data").list();
        s.close();
        return lst;
    }
    
    public Employee_data GetEmployee(int id){
        s=sf.openSession();
        Employee_data ed = (Employee_data)s.get(Employee_data.class,id);
        return ed;
    }
}
