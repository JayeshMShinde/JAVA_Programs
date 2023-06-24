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
@Table(name = "tbl_examdetial")
public class ExamDetials {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int exam_id;
	@Column(name = "exam_date",length = 40)
	private String exam_date;
	@Column(name = "start_time",length = 20)
	private String start_time;
	private String end_time;
	
	@OneToMany(mappedBy = "exam_detials",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties("exam_detials")
	private Set<ExamQuestion>examquestion;
	
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "student_id",nullable = false)
	private StudentDetails stud_details;
	
	private int flag_exam;

	public ExamDetials() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExamDetials(int exam_id, String exam_date, String start_time, String end_time,
			Set<ExamQuestion> examquestion, StudentDetails stud_details, int flag_exam) {
		super();
		this.exam_id = exam_id;
		this.exam_date = exam_date;
		this.start_time = start_time;
		this.end_time = end_time;
		this.examquestion = examquestion;
		this.stud_details = stud_details;
		this.flag_exam = flag_exam;
	}

	public int getExam_id() {
		return exam_id;
	}

	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}

	public String getExam_date() {
		return exam_date;
	}

	public void setExam_date(String exam_date) {
		this.exam_date = exam_date;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public Set<ExamQuestion> getExam_question() {
		return examquestion;
	}

	public void setExam_question(Set<ExamQuestion> examquestion) {
		this.examquestion = examquestion;
	}

	public StudentDetails getStud_details() {
		return stud_details;
	}

	public void setStud_details(StudentDetails stud_details) {
		this.stud_details = stud_details;
	}

	public int getFlag_exam() {
		return flag_exam;
	}

	public void setFlag_exam(int flag_exam) {
		this.flag_exam = flag_exam;
	}

}
