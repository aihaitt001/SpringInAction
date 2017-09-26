package studyspring.cn.djb.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution(* *.perform(..))")
	public void performance() {}
	
//	@Around("performance()")
//	public void watchPerformance(ProceedingJoinPoint  jp) {
//		try {
//			System.out.println("Silencing cell phones");
//			System.out.println("Taking seats");
//			jp.proceed();
//			System.out.println("prprpr");
//		}catch(Throwable e){
//			System.out.println("throw a ex::"+e);
//			
//		}
//	}
	
	
	@Before("performance()")
	public void silemceCellPhones() {
		System.out.println("Silencing cell phones");
	}
	@Before("performance()")
	public void takeSeats() {
		System.out.println("Taking seats");
	}
	
	@AfterReturning("performance()")
	public void applause() {
		System.out.println("prprpr");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("Demanding a refund");
	}
}
