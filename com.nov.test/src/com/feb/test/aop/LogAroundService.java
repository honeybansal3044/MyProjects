package com.feb.test.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogAroundService implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation paramMethodInvocation) throws Throwable {
		Log l = LogFactory.getLog(Bank.class);
		l.info("Before");
		Object obj = paramMethodInvocation.proceed();
		l.info("After");
		return obj;
	}

}
