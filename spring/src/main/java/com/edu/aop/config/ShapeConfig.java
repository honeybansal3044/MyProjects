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
	public ShapeService shape () {
		ShapeService service = new ShapeService();
		service.setCircle(circle());
		service.setTriangle(triangle());
		return service;
	}
	
	@Bean
	public Circle circle () {
		return new Circle();
	}
	
	@Bean
	public Triangle triangle () {
		return new Triangle();
	}
	
	@Bean
	public LoggingAspect loggingAspect () {
		return new LoggingAspect();
	}
}
