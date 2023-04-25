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
@Table(name = "tblcontentquestion")
public class ContentQuestion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int question_id;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private int correctoptionnumber;
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "content_id")
	private Topics_Content content;
	@Column(columnDefinition = "int default 0")
	private int flag_cq;
	
	public ContentQuestion(int question_id, String question, String option1, String option2, String option3,
			String option4, int correctoptionnumber, Topics_Content content, int flag_cq) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctoptionnumber = correctoptionnumber;
		this.content = content;
		this.flag_cq = flag_cq;
	}
	public ContentQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public int getCorrectoptionnumber() {
		return correctoptionnumber;
	}
	public void setCorrectoptionnumber(int correctoptionnumber) {
		this.correctoptionnumber = correctoptionnumber;
	}
	public Topics_Content getContent() {
		return content;
	}
	public void setContent(Topics_Content content) {
		this.content = content;
	}
	public int getFlag_cq() {
		return flag_cq;
	}
	public void setFlag_cq(int flag_cq) {
		this.flag_cq = flag_cq;
	}
		
}