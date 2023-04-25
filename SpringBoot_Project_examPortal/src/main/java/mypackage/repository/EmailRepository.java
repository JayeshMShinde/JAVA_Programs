package mypackage.repository;
import mypackage.model.EmailModel;

public interface EmailRepository {
	
	public String SendEmail(EmailModel email);

}
