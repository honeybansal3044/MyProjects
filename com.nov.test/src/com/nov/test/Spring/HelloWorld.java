package com.nov.test.Spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Honey Bansal
 */
public class HelloWorld implements InitializingBean, DisposableBean  {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After Properties Set Method");
	}
	
	public void init() {
		System.out.println("Init Method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy Method");		
	}
	
	public void destroy2() throws Exception {
		System.out.println("Destroy2 Method");		
	}

}
