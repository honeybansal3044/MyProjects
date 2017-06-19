package examples.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import examples.LifeCycleTest;

@Configuration
@ComponentScan("examples")
public class AppConfig {

	@Bean
	public LifeCycleTest cycle() {
		return new LifeCycleTest();
	}
}
