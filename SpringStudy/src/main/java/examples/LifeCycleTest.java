package examples;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleTest {
	
	//called auto
	public void close() {
		System.out.println("I am inside close");
	}
	
	@PostConstruct
	public void PostContructTest() {

	}
	
	@PreDestroy
	public void PreDestroyTest() {

	}

}
