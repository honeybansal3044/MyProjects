package com.feb.test.aop;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class DepositPointCut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method paramMethod, Class<?> paramClass) {
		if(paramMethod.getName().equals("deposit")) {
			return true;
		}
		return false;
	}

}
