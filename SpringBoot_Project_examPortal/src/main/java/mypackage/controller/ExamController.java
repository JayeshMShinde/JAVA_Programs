package mypackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mypackage.model.ExamDetials;
import mypackage.model.ExamQuestion;
import mypackage.service.ExamService;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE},allowedHeaders = "*")
public class ExamController {

	@Autowired
	ExamService eservice;
	
	@PostMapping("api/submitexam")
	public ExamDetials SubmitExam(@RequestBody ExamDetials exd) {
		System.out.println(exd.getExam_date()+" "+exd.getStart_time()+" to "+exd.getEnd_time());
		for(ExamQuestion q : exd.getExam_question()) {
			System.out.println(q.getContent_question().getQuestion_id()+" "+q.getContent_question().getCorrectoptionnumber());
		}
		
		return exd;
	}
	
	@PostMapping("api/examdetial")
	public String addExamdetial(@RequestBody ExamDetials ed) {
		return eservice.AddExamDetials(ed);
	}
	
	@GetMapping("api/examdetial")
	public List<ExamDetials>getAllExamDetials(){
		return eservice.GetAllExamDetials();
	}
	
	@GetMapping("api/examdetial/{id}")
	public List<ExamDetials>ExamDetailbyid(@PathVariable("id")int id){
		return eservice.GetExamDetialsbyStudentId(id);
	}
	
	
	//====================================Exam Question==========================================================================//

	@PostMapping("api/examquestion")
	public String addExamQuestion(@RequestBody ExamQuestion eq) {
		eservice.AddExamQuestion(eq);
		return "Data Added Successfully";
	}
	
	@GetMapping("api/examquestion/{id}")
	public List<ExamQuestion>getExamQuestionbyid(@PathVariable("id")int id) {
		return eservice.GetExamQuestion(id);
	}
}
