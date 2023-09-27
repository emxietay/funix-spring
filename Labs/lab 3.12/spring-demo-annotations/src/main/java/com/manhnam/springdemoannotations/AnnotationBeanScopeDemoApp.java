package com.manhnam.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		boolean result = theCoach == alphaCoach;

		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDaylyFortune());
		System.out.println(alphaCoach.getDaylyFortune());
		System.out.println(alphaCoach.getDailyWorkout());
		context.close();
	}
}
