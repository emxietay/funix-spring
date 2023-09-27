package com.manhnam.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
  private FortuneService fortuneService;
@Autowired
  public TennisCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  public String getDailyWorkout() {
    return "Practice your backhand volley";
  }

  @Override
  public String getDaylyFortune() {
    return fortuneService.getFortune();
  }
}
