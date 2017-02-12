package com.feb.test.aop;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class Client {

	public static void main(String[] args) {
		// target
		Bank bank = new Bank();
		// advice
		LogBeforeService lbs = new LogBeforeService();

		// add target and advice to proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(bank);
		//pfb.addAdvice(lbs);
		
		DepositPointCut dpc = new DepositPointCut();
		DefaultPointcutAdvisor dpa = new DefaultPointcutAdvisor();
		dpa.setAdvice(lbs);
		dpa.setPointcut(dpc);
		
		pfb.addAdvisor(dpa);

		// get gernerated proxy object
		Bank bankProxy = (Bank) pfb.getObject();
		bankProxy.deposit("sbi123", 5000);
		bankProxy.withdraw("sbi123", 5000);

		/*Bank bank2 = new Bank();
		LogAroundService las2 = new LogAroundService();

		ProxyFactoryBean pfb2 = new ProxyFactoryBean();
		pfb2.setTarget(bank2);
		pfb2.addAdvice(las2);
		Bank bankProxy2 = (Bank) pfb2.getObject();
		bankProxy2.deposit("sbi123", 5000);

		Bank bank3 = new Bank();
		LogThrowExceptionService ltes3 = new LogThrowExceptionService();

		ProxyFactoryBean pfb3 = new ProxyFactoryBean();
		pfb3.setTarget(bank3);
		pfb3.addAdvice(ltes3);
		Bank bankProxy3 = (Bank) pfb3.getObject();
		bankProxy3.deposit("sbi1234", 5000);*/

	}

}
