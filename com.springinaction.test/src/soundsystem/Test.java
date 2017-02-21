package soundsystem;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		CDPlayer cdPlayer = context.getBean(CDPlayer.class);
		cdPlayer.play();
		context.close();
		
	}

}
