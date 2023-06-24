package mypackage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_examquestion")
public class ExamQuestion {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int exam_question_id;
	private int sumbited_question_no;
	
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "question_id",nullable = false)
	private ContentQuestion content_question;
	
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "exam_id",nullable = false)
	private ExamDetials exam_detials;
	
	
	private int flag_eq;


	public ExamQuestion(int exam_question_id, int sumbited_question_no, ContentQuestion content_question,
			ExamDetials exam_detials, int flag_eq) {
		super();
		this.exam_question_id = exam_question_id;
		this.sumbited_question_no = sumbited_question_no;
		this.content_question = content_question;
		this.exam_detials = exam_detials;
		this.flag_eq = flag_eq;
	}


	public ExamQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getExam_question_id() {
		return exam_question_id;
	}


	public void setExam_question_id(int exam_question_id) {
		this.exam_question_id = exam_question_id;
	}


	public int getSumbited_question_no() {
		return sumbited_question_no;
	}


	public void setSumbited_question_no(int sumbited_question_no) {
		this.sumbited_question_no = sumbited_question_no;
	}


	public ContentQuestion getContent_question() {
		return content_question;
	}


	public void setContent_question(ContentQuestion content_question) {
		this.content_question = content_question;
	}


	public ExamDetials getExam_detials() {
		return exam_detials;
	}


	public void setExam_detials(ExamDetials exam_detials) {
		this.exam_detials = exam_detials;
	}


	public int getFlag_eq() {
		return flag_eq;
	}


	public void setFlag_eq(int flag_eq) {
		this.flag_eq = flag_eq;
	}
}
