package mypackage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import mypackage.model.EmailModel;
import mypackage.repository.EmailRepository;

@Service
public class EmailServices implements EmailRepository {

	@Autowired
	private JavaMailSender mailsender;
	@Value("${spring.mail.username}")
	private String sender;
	public String SendEmail(EmailModel m) {
		try {
			SimpleMailMessage mail = new SimpleMailMessage();
			mail.setFrom(sender);
			mail.setTo(m.getEmail_adress());
			mail.setSubject(m.getSubject());
			mail.setText(m.getMessage());
			mailsender.send(mail);
			return "Email Sent Successfully";
		}
		catch(Exception e) {
			return (e.getMessage());
		}
	}
}
