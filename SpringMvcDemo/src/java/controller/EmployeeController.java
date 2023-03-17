package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    @RequestMapping("employee")
    public ModelAndView EmpView(){
        ModelAndView m = new ModelAndView("employee/index");
        return m;
    }
    @RequestMapping("student")
    public ModelAndView studentView(){
    ModelAndView v = new ModelAndView("student/display");
    v.addObject("rno",100);
    v.addObject("name","Rajesh Kumar");
    return v;
    }
}
