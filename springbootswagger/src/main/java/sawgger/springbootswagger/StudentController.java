package sawgger.springbootswagger;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	public static  List<Student>lststud=new ArrayList<Student>();
	
	@GetMapping("/api/student")
	public List<Student>getAllStudent(){
		lststud.add(new Student(1,"Ajay"));
		lststud.add(new Student(2,"Jay"));
		lststud.add(new Student(3,"Raj"));
		lststud.add(new Student(4,"Mahesh"));
		lststud.add(new Student(5,"Amay"));
		return lststud;
	}
	
	@PostMapping("/api/student")
	public String AddStudent(@RequestBody Student st) {
		lststud.add(st);
		return "Student Added Successfully , Total Records :"+lststud.size();
	}
}
