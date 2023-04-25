package mypackage.controller;

import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mypackage.model.EmailModel;
import mypackage.service.EmailServices;

@RestController
@CrossOrigin(origins = "",methods = {RequestMethod.GET,RequestMethod.POST},allowedHeaders = "")
public class EmailApiController {

	@Autowired
	EmailServices emailservice;
	
	@PostMapping("api/sendmail")
	public EmailModel SendMail(@RequestBody EmailModel em) {
		 emailservice.SendEmail(em);
		 return em;	
	}
	
}
