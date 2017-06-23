package aop.load.time.weaving;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//to sun add below vm params
//-javaagent:C:\Users\honey.bansal.STI\.m2\repository\org\springframework\spring-instrument\4.3.9.RELEASE\spring-instrument-4.3.9.RELEASE.jar

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans-ltw.xml");
		
		StubEntitlementCalService entitlementCalculationService = (StubEntitlementCalService) ctx.getBean("entitlementCalculationService");
		
		// the profiling aspect is 'woven' around this method execution
		entitlementCalculationService.calc();
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
