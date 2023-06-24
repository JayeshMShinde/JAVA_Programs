package mypackage.controller;

import mypackage.controller.*;
import mypackage.model.*;
import mypackage.repository.StudentQualificationRepository;
import mypackage.service.*;
import mypackage.service.fileupload.FileStorageService;
import mypackage.service.fileupload.UploadFileResponse;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE},allowedHeaders = "*")
public class StudentController {

	@Autowired
	ExamPortalService epservice;
	
	@Autowired
	private FileStorageService fss;
	
	
	//==================LOGIN========================================================================
	
	@PostMapping("api/checklogin")
	public StudentDetails StudentLogin(@RequestBody StudentDetails sd) {
		return epservice.getStudentLogin(sd);
	}
	//=============================STUDENT DETAILS=====================================================
	
//		@GetMapping("api/student")
//		public List<StudentDetails>GetAllStudents(){
//			return epservice.GetStudents();
//		}
//		
//		@PostMapping("api/student")
//		public StudentDetails AddStudents(@RequestBody StudentDetails  s) {
//			return epservice.AddNewStudentDetails(s);
//		}
		
		
		@GetMapping("api/nextcode")
		public StudentDetails NextStudentCode() {
			String code = epservice.NextStudentCode();
			StudentDetails sd = new StudentDetails(0, "", "", code, "", "", "", "", 0, null,null);
			return sd;
		}
		@GetMapping("api/student/{id}")
		public StudentDetails getStudentByid(@PathVariable("id")int id) {
			return epservice.GetStudentsById(id);
		}
		
		@PostMapping("/Uploadfile")
		public UploadFileResponse Uploadfile(@RequestParam("file") MultipartFile file) {
			String fileName = fss.storeFile(file);
			String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/downloadFile")
					.path(fileName).toUriString();
			return new UploadFileResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());
		}

		@PostMapping("api/student")
		public StudentDetails AddNewStudentDetails(@RequestParam("student_name") String student_name, @RequestParam("student_code") String student_code,
				@RequestParam("email_address") String email_address, @RequestParam("mobile_no") String mobile_number,
				@RequestParam("profile_photo") MultipartFile file, @RequestParam("city") String city) {
			String fileName = fss.storeFile(file);
			StudentDetails sd = new StudentDetails(0, "", student_name, student_code, email_address, 
					mobile_number, fileName, city, 0, null,null);

			String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/downloadFile/")
					.path(fileName).toUriString();
			UploadFileResponse r = new UploadFileResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());
			epservice.AddNewStudentDetails(sd);
			return sd;
		}
		
		@GetMapping("api/student")
		public List<StudentDetails> GetAllStudentDetails() {
			List<StudentDetails> lst = new ArrayList<StudentDetails>();
			for (StudentDetails s : epservice.GetStudents()){ //getallstudentdetails method for services
				String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/downloadFile/")
						.path(s.getProfile_photo()).toUriString();
				StudentDetails sd = new StudentDetails(s.getStudent_id(), s.getPassword(), s.getStudent_name(),
						s.getStudent_code(), s.getEmail_address(), s.getMobile_no(), fileDownloadUri, s.getCity(), s.getFlag_sd(), null,null);
				lst.add(sd);
			}
			return lst;
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
	
	
	
	