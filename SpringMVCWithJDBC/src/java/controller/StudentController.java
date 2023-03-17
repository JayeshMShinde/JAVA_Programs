package controller;
import java.util.*;
import model.Student;
import dao.StudentDao;
import model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class StudentController {
    
    @Autowired
    StudentDao sdao;
    
    @RequestMapping("Student")
    public ModelAndView studview(){
        ModelAndView m  =  new ModelAndView("Student/index");
        List<Student>lst=sdao.GetStudents();
        m.addObject("Student",lst);
        return m;
    }
    
    @RequestMapping("add")
    public ModelAndView Addstudent(){
        int rno = sdao.NextRollno();
        Student st = new Student(rno,"",0,0,0,"",0,"");
        List<City>cities=sdao.GetCities();
        ModelAndView v = new ModelAndView("Student/AddStudent","command",st);
        v.addObject("cities",cities);
        return v;
    }
   
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public  RedirectView Save(@ModelAttribute("st")Student st){
        sdao.AddStudent(st);
        RedirectView rv = new RedirectView("Student");
        return rv;
    }
}
