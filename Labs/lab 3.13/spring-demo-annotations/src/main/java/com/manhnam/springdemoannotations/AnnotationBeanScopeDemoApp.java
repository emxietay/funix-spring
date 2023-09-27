package com.manhnam.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDaylyFortune());
		System.out.println(alphaCoach.getDaylyFortune());
		System.out.println(alphaCoach.getDailyWorkout());
		context.close();
	}
}
