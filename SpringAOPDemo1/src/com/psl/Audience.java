package com.psl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	
	@Pointcut(value="execution(* com.psl.Performer.perform(..))")
	public void pcl(){
		
	}
	
	@Before(value="pcl()")
	public void audienceTakeSeats() {
		System.out.println("Audience Take Seats.....");
	}
	
	@Before(value="pcl()")
	public void audienceSwitchOffPhones() {
		System.out.println("Audience Switches Phones Off");
	}
	
	@AfterReturning(value="pcl()")
	public void audienceApplaud() {
		System.out.println("Audience Applaud...claap");
	}
	
	@AfterThrowing(value="pcl()")
	public void audienceDemandRefund() {
		System.out.println("Give money back");

	}

	@After(value = "pcl()")
	public void audienceGoesHome(){
		System.out.println("Audience went home");
		
	}
	
//	public void audienceEatPopcorn(ProceedingJoinPoint pj){
//		System.out.println("Audience eating Popcorn");
//		audienceTakeSeats();
//		audienceSwitchOffPhones();
//		try {
//			pj.proceed();
//		} catch (Throwable e) {
//			audienceDemandRefund();
//			//e.printStackTrace();
//		}
//		audienceGoesHome();
//	}
}
