package com.manhnam.springdemoannotations;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
  public String getDailyWorkout() {
    return "Practice your backhand volley";
  }
}
