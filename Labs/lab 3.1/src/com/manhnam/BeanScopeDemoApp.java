package com.manhnam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
    Coach theCoach = context.getBean("myCoach", TrackCoach.class);
    Coach alphaCoach = context.getBean("myCoach", TrackCoach.class);
  }
}
