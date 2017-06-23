package aop.configurable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//to sun add below vm params
//-javaagent:C:\Users\honey.bansal.STI\.m2\repository\org\springframework\spring-instrument\4.3.9.RELEASE\spring-instrument-4.3.9.RELEASE.jar

public class MainApp {

	public static void main(String[] args) {
		
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-configurable.xml");
		
		context.getBean(ArtistDAOImpl.class);
		
		Artist artist = new Artist();
		artist.save();
		
		((ConfigurableApplicationContext) context).close();
		
	}
}
