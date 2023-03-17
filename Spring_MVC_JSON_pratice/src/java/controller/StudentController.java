package controller;

import java.util.*;
import model.Student;
import dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
   
    @Autowired
    StudentDao sdao;
    
    @RequestMapping("Studentlist")
    public @ResponseBody List<Student>Getallstudent(){
        return sdao.GetStudents();
    }
    
    @RequestMapping("")
    public ModelAndView Studentview(){
      return new ModelAndView("Student/index");
    }
    
    @RequestMapping(value="addstudent",method= RequestMethod.POST)
    public @ResponseBody  Student Addstudent(@ModelAttribute("st")Student st){
        System.out.print(st.getRno()+" "+st.getName());
        sdao.AddStudent(st);
        return st;
    }
    
    
    @RequestMapping(value="updatestudent",method= RequestMethod.POST)
    public @ResponseBody  Student updatestudent(@ModelAttribute("st")Student st){
        sdao.UpdateStudent(st);
        return st;
    }
    
    @RequestMapping("fetchstudent/{id}")
    public @ResponseBody Student Getstudentbyrno(@PathVariable("id")int id){
        return sdao.GetStudent(id);
    }
    
    @RequestMapping("deletestudent/{id}")
    public @ResponseBody Student deletestudentbyrno(@PathVariable("id")int id){
        Student st = sdao.GetStudent(id);
        sdao.DeleteStudent(id);
        return st;
    }
    
    
}
