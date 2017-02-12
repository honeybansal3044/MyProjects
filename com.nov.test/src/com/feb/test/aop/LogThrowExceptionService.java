package com.feb.test.aop;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

public class LogThrowExceptionService implements ThrowsAdvice {

	public void afterThrowing(Method method, Object[] args, Object target, Exception ex){
		Log l = LogFactory.getLog(Bank.class);
		l.info("Exception : " + ex.getMessage());
	}
}
