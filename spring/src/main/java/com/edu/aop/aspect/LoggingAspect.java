package com.edu.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	/*
	 * execution() will have parameters as method name. ie. for all methods.
	 */
	/*@Before("execution(public String getName())") //for all methods with this signatute.*/
	/*@Before("execution(public * com.edu.aop.model.Circle.get*())")*/
	/*@Before("execution(* get*())") // All getter methods with no parameters.*/
	/*@Before("execution(* get*(..))") // .. used for 0 or more parameters.*/
	/*@Before("execution(* get*(*))")  // * used for 1 or more parameters.*/
	/*@Before("execution(* com.edu.aop.model.*.get*())")  // * All the get methods in all the classes in com.edu.aop.model package.*/
	// This is for all getters in Circle class.
	@Before("allGetters() && allCircleMethods()")
	public void LoggingAdvice() {
		System.out.println("Logging Advice Run");
	}
	
	@Before("allGetters()") 
	public void TransactionAdvice() {
		System.out.println("Transaction Advice Run");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	 
	/*
	 * wihin() will have parameters as class name. ie. within all classes.
	 */
	 /*@Pointcut("wihin(com.edu.aop.model.Circle)") //Will be called for all methods in Circle class. */
	/* @Pointcut("wihin(com.edu.aop.model.*)") //Will be called for all methods in all classes in model package. */
	@Pointcut("within(com.edu.aop.model.Circle)")
	public void allCircleMethods() {}
	
}
