package com.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect2 {
	@Before("execution(public int com.spring.aop.CalImpl2.*(..))")
	public void before(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		System.out.println(name + "'s args from Cal2 are: [" + Arrays.toString(joinPoint.getArgs()) +"]");
	}
	
	@AfterReturning(value = "execution(public int com.spring.aop.CalImpl2.*(..))", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		String name = joinPoint.getSignature().getName();
		System.out.println(name + "'s return from Cal2 is: [" + result +"]");
	}
}
