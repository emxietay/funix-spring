package com.manhnam;

public class TrackCoach implements Coach {
  private FortuneService fortuneService;

  public TrackCoach(HappyFortuneService happyFortuneService) {
  }

  //init-method
  public void doMyStartupStuff() {
    System.out.println("TrackCoach: inside method doMyStartupStuff");
  }

  //  destroy-method
  public void doMyCleanupYoYo() {
    System.out.println("TrackCoach: inside method doMyCleanupYoYo");
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