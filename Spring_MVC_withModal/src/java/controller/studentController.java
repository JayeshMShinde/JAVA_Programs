
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import model.Student;
import java.util.*;
import dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class studentController {
    
    @Autowired
    StudentDao sdao;   
    
    @RequestMapping("student_jsp")
    public ModelAndView studview(){
        ModelAndView m = new ModelAndView("student_jsp/index");
        List<Student>lst = sdao.GetStudents();
        m.addObject("Student", lst);
        return m;
    }
    
    @RequestMapping("add")
    public ModelAndView Addstudent(){
        Student st =  new Student();
        ModelAndView v = new  ModelAndView("student_jsp/AddStudent","command",st);
        return v;
    }
    
    @RequestMapping(value="save",method=RequestMethod.POST)
    public RedirectView Save(@ModelAttribute("st")Student st){
        sdao.AddStudent(st);
        RedirectView r = new RedirectView("student_jsp");
        return r;
    }
}
