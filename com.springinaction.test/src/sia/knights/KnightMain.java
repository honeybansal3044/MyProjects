package sia.knights;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sia.knights.config.KnightConfig;

public class KnightMain {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:sia/knights/config/knight.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();

		ConfigurableApplicationContext context1 = new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight knight1 = context1.getBean(Knight.class);
		knight1.embarkOnQuest();
		context1.close();
		
		ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("classpath:/sia/knights/config/minstrel.xml");
		Knight knight2 = context2.getBean(Knight.class);
		knight2.embarkOnQuest();
		context2.close();
		
	}

}
