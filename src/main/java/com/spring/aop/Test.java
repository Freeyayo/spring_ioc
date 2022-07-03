package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("spring.xml");
		Cal bean = context.getBean(Cal.class);
		System.out.println(bean.add(1, 2));
		System.out.println(bean.sub(3, 2));
		System.out.println(bean.mul(2, 2));
		System.out.println(bean.div(4, 2));
		
		Cal2 bean2 = context.getBean(Cal2.class);
		System.out.println(bean2.add(1, 2));
		System.out.println(bean2.sub(3, 2));
		System.out.println(bean2.mul(2, 2));
		System.out.println(bean2.div(4, 2));
		
	}
}
