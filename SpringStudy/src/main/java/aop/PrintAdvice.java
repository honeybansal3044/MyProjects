package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PrintAdvice {

	@Before("aop.PointCutConfig.printPointCut()")
	public void printBeforAdvice(JoinPoint jp) {
		System.out.println("I am inside printBeforAdvice");
	}

	@Around("aop.PointCutConfig.printPointCut2()")
	public Object printAroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("I am inside first printAroundAdvice");
		Object obj = pjp.proceed();
		System.out.println("I am inside second printAroundAdvice");
		return obj;
	}

}
