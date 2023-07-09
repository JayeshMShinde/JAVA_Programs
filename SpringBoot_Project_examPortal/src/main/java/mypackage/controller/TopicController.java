package mypackage.controller;


import mypackage.controller.*;
import mypackage.model.*;
import mypackage.repository.StudentQualificationRepository;
import mypackage.service.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE},allowedHeaders = "*")
public class TopicController {

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
	
	@PutMapping("api/topics")
	public Topics UpdateTopics(@RequestBody Topics t) {
		return epservice.UpdateTopic(t);
	}
	
	@DeleteMapping("api/topics/{id}")
	public Topics DeleteTopicsById(@PathVariable("id")int id) {
		return epservice.DeleteTopic(id);
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
	
	@PutMapping("api/topicscontent")
	public String UpdateTopicContent(@RequestBody Topics_Content t) {
		 epservice.updateTopicContent(t);
		 return "Updated Successfully";
	}
	
	@DeleteMapping("api/topicscontent/{id}")
	public String DeleteTopicContentById(@PathVariable("id")int id) {
		epservice.DeleteTopicContent(id);
		return "Deleted Successfully";
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
		
		@PutMapping("api/contentquestion")
		public String UpdateContentQuestion(@RequestBody ContentQuestion cq) {
			 epservice.UpdateContentQuestion(cq);
			 return "Updated Successfully";
		}
		
		@GetMapping("api/topicwiseQuestion/{id}")
		public List<ContentQuestion>getTopicWiseQuestion(@PathVariable("id")int id) {
			return epservice.TopicWiseContentQuestion(id);
		}
		
		@DeleteMapping("api/contentquestion/{id}")
		public String DeleteContentQuestion(@PathVariable("id")int id) {
			epservice.DeleteContentQuestion(id);
			return "Deleted Successfully";
		}
		
}