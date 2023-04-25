package mypackage.model;

public class EmailModel {

	private String email_adress;
	private  String subject;
	private String  message;
	
	public EmailModel(String email_adress, String subject, String message) {
		super();
		this.email_adress = email_adress;
		this.subject = subject;
		this.message = message;
	}
	public EmailModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail_adress() {
		return email_adress;
	}
	public void setEmail_adress(String email_adress) {
		this.email_adress = email_adress;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
