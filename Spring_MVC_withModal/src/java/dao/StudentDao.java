package dao;

import java.util.*;
import model.Student;

public class StudentDao {
    
    
    public static List<Student>lststud= new ArrayList<>();
    public int nextRollno(){
        return lststud.size()+1;
    }
    public int AddStudent(Student st){
        st.setRno(nextRollno());
        lststud.add(st);
        return lststud.size();
    }
    
    public List<Student>GetStudents(){
        return lststud;
    }
}
