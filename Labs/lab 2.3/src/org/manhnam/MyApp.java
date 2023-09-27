package org.manhnam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
  public static void main(String[] args) {
//    Coach theCoach = new BaseballCoach();
//    System.out.println(theCoach.getDailyWorkout());
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Coach myCoach = context.getBean("myCoach", Coach.class);
    System.out.println(myCoach.getDailyWorkout());
    context.close();
  }
}