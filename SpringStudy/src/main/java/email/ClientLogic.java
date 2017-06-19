package email;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-email.xml");

		MailLogic mail = context.getBean(MailLogic.class);
		mail.sendMail("HoneyBansal", "honeybansal3044@gmail.com", "Testing Java Mail", "Did you get the mail ?");

		((ConfigurableApplicationContext) context).close();

	}

}
