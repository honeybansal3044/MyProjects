package com.edu.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.edu.aop.aspect.LoggingAspect;
import com.edu.aop.model.Circle;
import com.edu.aop.model.Triangle;
import com.edu.aop.service.ShapeService;

@Configuration
@EnableAspectJAutoProxy

public class ShapeConfig {
	
	@Bean
	public ShapeService getShape () {
		ShapeService service = new ShapeService();
		service.setCircle(getCircle());
		service.setTriangle(getTriangle());
		return service;
	}
	
	@Bean
	public Circle getCircle () {
		return new Circle();
	}
	
	@Bean
	public Triangle getTriangle () {
		return new Triangle();
	}
	
	@Bean
	public LoggingAspect getLoggingAspect () {
		return new LoggingAspect();
	}
}
