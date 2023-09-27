package com.manhnam;

public class CricketCoach implements Coach {
  private FortuneService fortuneService;

  public CricketCoach() {
    System.out.println("CricketCoach: inside no-arg constructor ");

  }

  public CricketCoach(HappyFortuneService happyFortuneService) {
  }


  public void setFortuneService(FortuneService fortuneService) {
    System.out.println("CricketCoach: inside method - setFortuneService");
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes";
  }


}