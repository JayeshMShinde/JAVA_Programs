package mypackage.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tblstudentdetail")
public class StudentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_id;
	private String password;
	private String student_name;
	@Column(name = "student_code",nullable = false,unique = true,length = 100)
	private String student_code;
	@Column(nullable = false,unique = true)
	private String email_address;
	@Column(name = "mobile_no",length = 20)
	private String mobile_no;
	@Column(name = "profile_photo",length = 100)
	private String profile_photo;
	private String city;
	@Column(columnDefinition = "int default 0")
	private int flag_sd;
	@OneToMany(mappedBy = "studentdetials",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties("studentdetials")
	private Set<StudentQualification>studqual;
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_code() {
		return student_code;
	}
	public void setStudent_code(String student_code) {
		this.student_code = student_code;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getProfile_photo() {
		return profile_photo;
	}
	public void setProfile_photo(String profile_photo) {
		this.profile_photo = profile_photo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getFlag_sd() {
		return flag_sd;
	}
	public void setFlag_sd(int flag_sd) {
		this.flag_sd = flag_sd;
	}
	public Set<StudentQualification> getStudqual() {
		return studqual;
	}
	public void setStudqual(Set<StudentQualification> studqual) {
		this.studqual = studqual;
	}
	public StudentDetails(int student_id, String password, String student_name, String student_code,
			String email_address, String mobile_no, String profile_photo, String city, int flag_sd,
			Set<StudentQualification> studqual) {
		super();
		this.student_id = student_id;
		this.password = password;
		this.student_name = student_name;
		this.student_code = student_code;
		this.email_address = email_address;
		this.mobile_no = mobile_no;
		this.profile_photo = profile_photo;
		this.city = city;
		this.flag_sd = flag_sd;
		this.studqual = studqual;
	}
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
}	
	