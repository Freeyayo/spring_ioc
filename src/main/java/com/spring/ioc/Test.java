package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.spring.configuration.BeanConfiguration;

public class Test {
	private static ApplicationContext context;

	public static void main(String[] args) {
//		context = new ClassPathXmlApplicationContext("spring.xml");
//		System.out.println(context.getBean("config"));
		
//		context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		context = new AnnotationConfigApplicationContext("com.spring.configuration");
//		System.out.println(context.getBean("dataConfig"));
		
		context = new AnnotationConfigApplicationContext("com.spring.ioc");
//		System.out.println(context.getBean(DataConfig.class));
		System.out.println(context.getBean(GlobalConfig.class));
	}
}