package com.manhnam;

public class CricketCoach implements Coach {
  private String emailAddress;
  private String team;
  private FortuneService fortuneService;


  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    System.out.println("CricketCoach: inside setter method - setEmailAddress");
    this.emailAddress = emailAddress;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    System.out.println("CricketCoach: inside setter method - setTeam");
    this.team = team;
  }

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