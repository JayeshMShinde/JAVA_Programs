package mypackage.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tbltopics")
public class Topics {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int topic_id;
	@Column(length = 200,nullable = false,unique = true)
	private String topic_name;
	@Column(columnDefinition = "int default 0")
	private int flag_top;
	
	@OneToMany(mappedBy = "topics",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties("topics")
	private Set<Topics_Content>topicscontent;
	
	@OneToMany(mappedBy = "topics",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties("topics")
	private Set<ContentQuestion>content_ques;

	public Topics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Topics(int topic_id, String topic_name, int flag_top, Set<Topics_Content> topicscontent,
			Set<ContentQuestion> content_ques) {
		super();
		this.topic_id = topic_id;
		this.topic_name = topic_name;
		this.flag_top = flag_top;
		this.topicscontent = topicscontent;
		this.content_ques = content_ques;
	}

	public int getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}

	public String getTopic_name() {
		return topic_name;
	}

	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
	}

	public int getFlag_top() {
		return flag_top;
	}

	public void setFlag_top(int flag_top) {
		this.flag_top = flag_top;
	}

	public Set<Topics_Content> getTopicscontent() {
		return topicscontent;
	}

	public void setTopicscontent(Set<Topics_Content> topicscontent) {
		this.topicscontent = topicscontent;
	}

	public Set<ContentQuestion> getContent_ques() {
		return content_ques;
	}

	public void setContent_ques(Set<ContentQuestion> content_ques) {
		this.content_ques = content_ques;
	}

		
}