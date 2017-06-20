package examples;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CommandManager implements ApplicationContextAware {
	
	private ApplicationContext context;

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}
	
	public Command getApp() {
		return this.context.getBean("command", Command.class);
	}

}
