package com.manhnam.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ConfigurationDemoApp {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDaylyFortune());
		context.close();
	}
}
