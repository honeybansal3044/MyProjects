package com.feb.test.aop;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeService implements MethodBeforeAdvice, AfterReturningAdvice {

	@Override
	public void before(Method m, Object[] params, Object obj) throws Throwable {
		Log l = LogFactory.getLog(Bank.class);
		l.info("Before Deposit method");
 	}

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		Log l = LogFactory.getLog(Bank.class);
		l.info("After Deposit method");
		
	}

}
