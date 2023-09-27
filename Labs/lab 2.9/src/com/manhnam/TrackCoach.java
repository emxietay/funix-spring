package com.manhnam;

public class TrackCoach implements Coach {
  private FortuneService fortuneService;

  public TrackCoach(HappyFortuneService happyFortuneService) {
  }

  @Override
  public String getDailyWorkout() {
    return "Run a hard 5k";
  }

  @Override
  public String getDailyFortune() {
    return "Just do it, today is your lucky day!";
  }

}