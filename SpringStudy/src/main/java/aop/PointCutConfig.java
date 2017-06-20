package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PointCutConfig {

	@Pointcut("execution(* aop.impl..*.addCustomer(..))")
	public void printPointCut() {
		System.out.println("I am Print Point Cut 1");
	}

	@Pointcut("execution(* aop.impl..*.*(..))")
	public void printPointCut2() {
		System.out.println("I am Print Point Cut 2");
	}
}
