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
@Table(name = "tblstudqualification")
public class StudentQualification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qualifiaction_id;
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "student_id")
	private StudentDetails studentdetials;
	private String qualification;
	private String university;
	private int passing_year;
	private float percentage;
	@Column(name = "flag_sq",columnDefinition = "int default 0")
	private int flag_sq;
	
	
	
	public StudentQualification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentQualification(int qualifiaction_id, StudentDetails studentdetials, String qualification,
			String university, int passing_year, float percentage, int flag_sq) {
		super();
		this.qualifiaction_id = qualifiaction_id;
		this.studentdetials = studentdetials;
		this.qualification = qualification;
		this.university = university;
		this.passing_year = passing_year;
		this.percentage = percentage;
		this.flag_sq = flag_sq;
	}
	public int getQualifiaction_id() {
		return qualifiaction_id;
	}
	public void setQualifiaction_id(int qualifiaction_id) {
		this.qualifiaction_id = qualifiaction_id;
	}
	public StudentDetails getStudentdetials() {
		return studentdetials;
	}
	public void setStudentdetials(StudentDetails studentdetials) {
		this.studentdetials = studentdetials;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public int getPassing_year() {
		return passing_year;
	}
	public void setPassing_year(int passing_year) {
		this.passing_year = passing_year;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public int getFlag_sq() {
		return flag_sq;
	}
	public void setFlag_sq(int flag_sq) {
		this.flag_sq = flag_sq;
	}
}
	