package org.example;

public class MyApp {
  public static void main(String[] args) {
    Coach myCoach = new BaseballCoach();
    System.out.println(myCoach.getDailyWorkout());
  }
}