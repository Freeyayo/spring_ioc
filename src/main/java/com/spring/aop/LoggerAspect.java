package com.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {
	@Before("execution(public int com.spring.aop.CalImpl.*(..))")
	public void before(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		System.out.println(name + "'s args are: [" + Arrays.toString(joinPoint.getArgs()) +"]");
	}
	
	@AfterReturning(value = "execution(public int com.spring.aop.CalImpl.*(..))", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		String name = joinPoint.getSignature().getName();
		System.out.println(name + "'s return is: [" + result +"]");
	}
}
