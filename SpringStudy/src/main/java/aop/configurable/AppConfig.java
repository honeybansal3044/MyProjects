package aop.configurable;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@Configuration
@ComponentScan(basePackages="aop.configurable")
@EnableSpringConfigured
@EnableLoadTimeWeaving
public class AppConfig {

}
