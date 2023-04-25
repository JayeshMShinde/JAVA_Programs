package mypackage.controller;

import mypackage.controller.*;
import mypackage.model.*;
import mypackage.repository.StudentQualificationRepository;
import mypackage.service.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE},allowedHeaders = "*")
public class ExamPortalController {

	@Autowired
	ExamPortalService epservice;
	
	
	//===================TOPICS===============================================================
	@GetMapping("api/topics")
	public List<Topics>GetAllTopics(){
		return epservice.GetAllTopics();
	}
	
	@PostMapping("api/topics")
	public Topics AddTopics(@RequestBody Topics t) {
		return epservice.AddTopics(t);
	}
	
	
	//=======================TOPIC CONTENT===========================================================
	@GetMapping("api/topicscontent")
	public List<Topics_Content>GetAllTopicContent(){
		return epservice.getTopicContent();
	}
	
	@PostMapping("api/topicscontent")
	public Topics_Content addTopiccsContent(@RequestBody Topics_Content tc) {
		return epservice.addTopicContent(tc);
	}
	
	
	@GetMapping("api/topicwisecontent/{id}")
	public List<Topics_Content>getAllContent(@PathVariable("id")int id) {
		return epservice.getTopicwiseContent(id);
	}
	
	
	//=============================CONTENT QUESTION=====================================================
	@GetMapping("api/contentquestion")
	public List<ContentQuestion>GetAllContentQuestion(){
		return epservice.GetContentQuestion();
	}
	
	@PostMapping("api/contentquestion")
	public ContentQuestion addContentQuestion(@RequestBody ContentQuestion cq) {
		return epservice.AddContentQuestion(cq);
	}
	
	
	//=============================STUDENT DETAILS=====================================================
	
	@GetMapping("api/student")
	public List<StudentDetails>GetAllStudents(){
		return epservice.GetStudents();
	}
	
	@PostMapping("api/student")
	public StudentDetails AddStudents(@RequestBody StudentDetails  s) {
		return epservice.AddNewStudentDetails(s);
	}
	
	@GetMapping("api/nextcode")
	public StudentDetails NextStudentCode() {
		String code = epservice.NextStudentCode();
		StudentDetails sd = new StudentDetails(0, "", "", code, "", "", "", "", 0, null);
		return sd;
	}
	@GetMapping("api/student/{id}")
	public StudentDetails getStudentByid(@PathVariable("id")int id) {
		return epservice.GetStudentsById(id);
	}
	
	//=============================STUDENT QUALIFIACTION=====================================================

	@GetMapping("api/student/qualfication")
	public List<StudentQualification>GetAllQualification(){
		return epservice.GetQualification();
	}
	
	
	@GetMapping("api/student/qualfication/{id}")
	public StudentQualification GetQualificationbyId(@PathVariable("id")int id) {
		return epservice.GetStudentQualifiaction(id);
	}
	
	@PostMapping("api/student/qualfication")
	public StudentQualification AddQualification(@RequestBody StudentQualification sq) {
		return epservice.addNewQualification(sq);
	}
	
}