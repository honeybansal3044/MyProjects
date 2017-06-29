package com.edu.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.edu.aop.config.ShapeConfig;
import com.edu.aop.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ShapeConfig.class);
		ShapeService service = context.getBean(ShapeService.class);
		service.getCircle().setName("Dummy New");
		System.out.println(service.getCircle().getName());
	}

}
