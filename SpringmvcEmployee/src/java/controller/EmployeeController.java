package controller;

import java.util.*;
import model.City;
import model.Employee;
import dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class EmployeeController {
    
    @Autowired
    EmployeeDao edao;
    
    @RequestMapping("Employee")
    public ModelAndView empView(){
        ModelAndView m = new ModelAndView("Employee/index");
        List<Employee>lst=edao.GetEmployees();
        m.addObject("Employee",lst);
        return m;
    }
    
    @RequestMapping("add")
    public ModelAndView AddEmp(){
        int eid = edao.nextEmpid();
        Employee e = new Employee(eid, "","", 0,"","",0);
        List<City>lstc=edao.GetCities();
        ModelAndView v = new  ModelAndView("Employee/Addemployee","command",e);
        v.addObject("cities",lstc);
        return v;
        
    }
    
    @RequestMapping(value="save",method=RequestMethod.POST)
    public RedirectView Save(@ModelAttribute("e")Employee e){
        edao.Addemployee(e);
        RedirectView rv = new RedirectView("Employee");
        return rv;
    }
}
