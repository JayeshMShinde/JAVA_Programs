package mypackage.service;

import mypackage.model.*;
import mypackage.repository.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamPortalService {

	@Autowired TopicRepository topicrepo;
	@Autowired TopicContentRepository topiccontentrepo;
	@Autowired ContentQuestionRepository contentquerepo;
	@Autowired StudentDetailsRepository studdetailrepo;
	@Autowired StudentQualificationRepository studqualrepo;
	@Autowired EmailRepository emailrepo;
	
	//=====TOPICS====================================================================
	public List<Topics>GetAllTopics(){
		
		List<Topics>lsttopic = new ArrayList<Topics>();
		for(Topics t : topicrepo.findAll()) {
			Topics tp = new Topics(t.getTopic_id(), t.getTopic_name(), 0,null);
			lsttopic.add(tp);
		}
		return lsttopic;
	}
	
	public Topics AddTopics(Topics t) {
		return topicrepo.save(t);
	}
	
	public Topics GetTopicsbyId(int id) {
		Topics t = topicrepo.findById(id).get();
		Topics tp = new Topics(t.getTopic_id(), t.getTopic_name(), 0, null);
		return tp;
	}
	
	
	
	

	//=====TOPICS CONTENT====================================================================
	public List<Topics_Content>getTopicContent(){
		List<Topics_Content>lsttc = new ArrayList<Topics_Content>();
		for(Topics_Content tc : topiccontentrepo.findAll()) {
			Topics t = new Topics(tc.getTopics().getTopic_id(), tc.getTopics().getTopic_name(), 0, null);
			Topics_Content tcon = new Topics_Content(tc.getContent_id(), tc.getContent_name(), tc.getContent_tutorial(), 0, t,null);
			lsttc.add(tcon);
		}
		return lsttc;
	}
	
	public Topics_Content addTopicContent(Topics_Content tc) {
		return topiccontentrepo.save(tc);
	}
	
	public Topics_Content getTopicContentbyid(int id){
		Topics_Content tc = topiccontentrepo.findById(id).get();
			Topics t = new Topics(tc.getTopics().getTopic_id(), tc.getTopics().getTopic_name(), 0, null);
			Topics_Content tcon = new Topics_Content(tc.getContent_id(), tc.getContent_name(), tc.getContent_tutorial(), 0, t, null);
		return tcon;
	}
	
	public List<Topics_Content>getTopicwiseContent(int topic_id) {
		List<Topics_Content>lsttc = new ArrayList<Topics_Content>();
		for(Topics_Content tc : topiccontentrepo.findAll()) {
			Topics t = new Topics(tc.getTopics().getTopic_id(), tc.getTopics().getTopic_name(), 0, null);
			if(t.getTopic_id()==topic_id) {
				Topics_Content tcon = new Topics_Content(tc.getContent_id(), tc.getContent_name(), tc.getContent_tutorial(), 0, t,null);
				lsttc.add(tcon);
			}
		}
		return lsttc;
	}
	
	

	//=====CONTENT QUESTION====================================================================
	public List<ContentQuestion>GetContentQuestion(){
		List<ContentQuestion>lstcon = new ArrayList<ContentQuestion>();
		for(ContentQuestion cq : contentquerepo.findAll()) {
			Topics t = new Topics(cq.getContent().getTopics().getTopic_id(), cq.getContent().getTopics().getTopic_name(), 0, null);
			Topics_Content tc = new  Topics_Content(cq.getContent().getContent_id(), cq.getContent().getContent_name(), cq.getContent().getContent_tutorial(), 0, t, null);
			ContentQuestion cque = new ContentQuestion(cq.getQuestion_id(), cq.getQuestion(), cq.getOption1(), cq.getOption2(), cq.getOption3(), cq.getOption4(), cq.getCorrectoptionnumber(), tc, 0);
			lstcon.add(cque);
		}
		return lstcon;
	}
	
	public ContentQuestion AddContentQuestion(ContentQuestion cq) {
		return contentquerepo.save(cq);
	}
	
	public ContentQuestion getContentQuestionbyId(int id) {
		ContentQuestion cq = contentquerepo.findById(id).get();
		Topics t = new Topics(cq.getContent().getTopics().getTopic_id(), cq.getContent().getTopics().getTopic_name(), 0, null);
		Topics_Content tc = new  Topics_Content(cq.getContent().getContent_id(), cq.getContent().getContent_name(), cq.getContent().getContent_tutorial(), 0, t, null);
		ContentQuestion cque = new ContentQuestion(cq.getQuestion_id(), cq.getQuestion(), cq.getOption1(), cq.getOption2(), cq.getOption3(), cq.getOption4(), cq.getCorrectoptionnumber(), tc, 0);
		return cque;
	}
	//==============STUDENT DETAILS====================================================================
	
	
	public List<StudentDetails>GetStudents(){
		List<StudentDetails>lst = new ArrayList<StudentDetails>();
		for(StudentDetails s:studdetailrepo.findAll()) {
			StudentDetails sd = new StudentDetails(s.getStudent_id(), s.getPassword(), s.getStudent_name(), s.getStudent_code(),s.getEmail_address(), s.getMobile_no(), s.getProfile_photo(), s.getCity(), 0, null);
			lst.add(sd);
		}
		return lst;
	}
	
	public StudentDetails GetStudentsById(int id){
		StudentDetails s= studdetailrepo.findById(id).get();
		StudentDetails sd = new StudentDetails(s.getStudent_id(), s.getPassword(), s.getStudent_name(), s.getStudent_code(),s.getEmail_address(), s.getCity(), s.getMobile_no(), s.getProfile_photo(), 0, null);
		return sd;
	}
	public String GeneratePassword(int size) {
		String data="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQQRSTUVWXYZ1234567890!@#$%^&";
		String password="";
		Random r=new Random();
		for(int i=0;i<size;i++) {

			password += data.charAt(r.nextInt(data.length()-1));
		}
		return password;
	}
	
	public String NextStudentCode() {
		String code="";
		
		List<StudentDetails>lst=studdetailrepo.findAll();
		int id=0;  
		if(lst.size()>0) {
			id=lst.size()+1;
		}
		else {
			id=1;
		}
		code="S";
		if(id<10) {
			code=code+"00000000"+id;
		}
		else if(id>=10 && id<99) {
			code=code+"0000000"+id;
		}
		else if(id>=100 && id<999) {
			code=code+"000000"+id;
		}
		else if(id>=1000 && id<9999) {
			code=code+"00000"+id;
		}
		
		return code;
	}

//	public StudentDetails AddNewStudentDetails(StudentDetails s) {
//		StudentDetails sd=new StudentDetails(s.getStudent_id(), GeneratePassword(8), s.getStudent_name(), NextStudentCode(), s.getEmail_address(), s.getMobile_no(), s.getProfile_photo(), s.getCity(), s.getFlag_sd(), null);
//		return studdetailrepo.save(sd);
//	}
//	
	public StudentDetails AddNewStudentDetails(StudentDetails s) {
		String password = GeneratePassword(8);
		StudentDetails sd=new StudentDetails(s.getStudent_id(), password, s.getStudent_name(), NextStudentCode(), s.getEmail_address(), s.getMobile_no(), s.getProfile_photo(), s.getCity(), s.getFlag_sd(), null);
		StudentDetails studd = studdetailrepo.save(sd);
		String subject ="Student Registartion Conformation";
		String message="Dear "+sd.getStudent_name()+", Your account has been created successfully. You can access your account using following credentials \n Student Code="+sd.getStudent_code()+"\n Password="+password+"  \n ..... Thanks.";
		EmailModel em=new EmailModel(sd.getEmail_address(), subject, message);
		emailrepo.SendEmail(em);
		return studd;
	}
	//===================Student Qualifiaction========================
	
	public List<StudentQualification>GetQualification(){
		List<StudentQualification>lst = new ArrayList<StudentQualification>();
		for(StudentQualification sq : studqualrepo.findAll()) {
			StudentQualification squal = new StudentQualification(sq.getQualifiaction_id(), null, sq.getQualification(), sq.getUniversity(), sq.getPassing_year(), sq.getPercentage(), sq.getFlag_sq());
			lst.add(squal);
		}
	return lst;
	}
	
	public StudentQualification GetStudentQualifiaction(int id) {
		StudentQualification sq = studqualrepo.findById(id).get();
		StudentQualification squal = new StudentQualification(sq.getQualifiaction_id(), null, sq.getQualification(), sq.getUniversity(), sq.getPassing_year(), sq.getPercentage(), sq.getFlag_sq());
		return squal;
	}
	
	public StudentQualification addNewQualification(StudentQualification sq) {
		StudentQualification squal = studqualrepo.save(sq);
		return squal;
	}
	
	
}
