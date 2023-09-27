package com.manhnam.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BeansDemoApp {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach theCoach = context.getBean("swimCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDaylyFortune());
		context.close();
	}
}
