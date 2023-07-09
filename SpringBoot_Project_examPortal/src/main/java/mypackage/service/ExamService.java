package mypackage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypackage.model.ContentQuestion;
import mypackage.model.ExamDetials;
import mypackage.model.ExamQuestion;
import mypackage.model.StudentDetails;
import mypackage.model.Topics;
import mypackage.repository.ContentQuestionRepository;
import mypackage.repository.ExamQuestionRepositroy;
import mypackage.repository.ExamRepository;
import mypackage.repository.StudentDetailsRepository;

@Service
public class ExamService {

	@Autowired
	ExamRepository exrepo;
	
	@Autowired
	ExamQuestionRepositroy eqrepo;
	
	@Autowired
	StudentDetailsRepository srepo;
	
	@Autowired
	ContentQuestionRepository cqrepo;
	
	public List<ExamDetials> GetExamDetials() {
		List<ExamDetials>lst = new ArrayList<ExamDetials>();
		for(ExamDetials e : exrepo.findAll()) {
			ExamDetials dt = new ExamDetials(e.getExam_id(),e.getExam_date(),e.getStart_time(),e.getEnd_time(),null,null, 0);
			lst.add(dt);
		}
		return lst;
	}
	
	public List<ExamDetials>GetExamDetialsbyStudentId(int sid) {
		List<ExamDetials>lst = new ArrayList<ExamDetials>();
		for(ExamDetials e : exrepo.findAll()) {
			if(e.getStud_details().getStudent_id()==sid) {
				StudentDetails sd = new StudentDetails(e.getStud_details().getStudent_id(),e.getStud_details().getPassword(),e.getStud_details().getStudent_name(),e.getStud_details().getStudent_code(),e.getStud_details().getEmail_address(),e.getStud_details().getMobile_no(),e.getStud_details().getProfile_photo(),e.getStud_details().getCity(),e.getStud_details().getFlag_sd(),null,null);
				ExamDetials dt = new ExamDetials(e.getExam_id(),e.getExam_date(),e.getStart_time(),e.getEnd_time(),null,sd, 0);
				lst.add(dt);
			}
		}
		return lst;
	}
	
	public List<ExamDetials>GetAllExamDetials() {
		List<ExamDetials>lst = new ArrayList<ExamDetials>();
		for(ExamDetials e : exrepo.findAll()) {
			ExamDetials dt = new ExamDetials(e.getExam_id(),e.getExam_date(),e.getStart_time(),e.getEnd_time(),null,null, 0);
			lst.add(dt);
		}
		return lst;
	}
	
	
	public String AddExamDetials(ExamDetials e) {
		ExamDetials dt = new ExamDetials(e.getExam_id(),e.getExam_date(),e.getStart_time(),e.getEnd_time(),null,e.getStud_details(), 0);
		ExamDetials ed = exrepo.save(dt);
		for(ExamQuestion q : e.getExam_question()) {
			q.setExam_detials(ed);
			eqrepo.save(q);
		}
		return "Submitted Exam";
	}
	
	//=============Exam Question===================================================================================//
	
	public ExamQuestion AddExamQuestion(ExamQuestion eq) {
		return eqrepo.save(eq);
	}
	
	public List<ExamQuestion>GetExamQuestion(int eid){
		List<ExamQuestion>lst=new ArrayList<ExamQuestion>();
		for(ExamQuestion q:eqrepo.findAll()) {
			if(q.getExam_detials().getExam_id()==eid) {
				ContentQuestion conq  = new ContentQuestion();
				Topics t = new Topics(conq.getTopics().getTopic_id(),conq.getTopics().getTopic_name() ,conq.getTopics().getFlag_top(),null,null);
				ExamDetials ed = new ExamDetials(q.getExam_detials().getExam_id(),q.getExam_detials().getExam_date(),q.getExam_detials().getStart_time(),q.getExam_detials().getEnd_time(),null,null,q.getExam_detials().getFlag_exam());
				ContentQuestion cq = new ContentQuestion(q.getContent_question().getQuestion_id(),q.getContent_question().getQuestion(),q.getContent_question().getOption1(),q.getContent_question().getOption2(),q.getContent_question().getOption3(),q.getContent_question().getOption4(),q.getContent_question().getCorrectoptionnumber(),null,null,t,q.getContent_question().getFlag_cq());
				ExamQuestion eq = new ExamQuestion(q.getExam_question_id(),q.getSumbited_question_no(),cq,ed,q.getFlag_eq());
				lst.add(eq);
			}
		}
		return lst;
	}
	
	//==============================================================================================================//
}
