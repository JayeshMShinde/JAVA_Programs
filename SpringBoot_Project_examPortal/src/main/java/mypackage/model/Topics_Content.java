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
@Table(name = "tbltopiccontent")
public class Topics_Content {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int content_id;
	private String content_name;
	@Column(nullable = false,unique = true,length = 500)
	private String content_tutorial;
	@Column(columnDefinition = "int default 0")
	private int flag_tc;
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "topic_id")
	private Topics topics;
	@OneToMany(mappedBy = "content",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties("content")
	private Set<ContentQuestion>contentquestion;
	
	public Topics_Content(int content_id, String content_name, String content_tutorial, int flag_tc, Topics topics,
			Set<ContentQuestion> contentquestion) {
		super();
		this.content_id = content_id;
		this.content_name = content_name;
		this.content_tutorial = content_tutorial;
		this.flag_tc = flag_tc;
		this.topics = topics;
		this.contentquestion = contentquestion;
	}
	public Topics_Content() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getContent_id() {
		return content_id;
	}
	public void setContent_id(int content_id) {
		this.content_id = content_id;
	}
	public String getContent_name() {
		return content_name;
	}
	public void setContent_name(String content_name) {
		this.content_name = content_name;
	}
	public String getContent_tutorial() {
		return content_tutorial;
	}
	public void setContent_tutorial(String content_tutorial) {
		this.content_tutorial = content_tutorial;
	}
	public int getFlag_tc() {
		return flag_tc;
	}
	public void setFlag_tc(int flag_tc) {
		this.flag_tc = flag_tc;
	}
	public Topics getTopics() {
		return topics;
	}
	public void setTopics(Topics topics) {
		this.topics = topics;
	}
	public Set<ContentQuestion> getContentquestion() {
		return contentquestion;
	}
	public void setContentquestion(Set<ContentQuestion> contentquestion) {
		this.contentquestion = contentquestion;
	}
	
	
}
