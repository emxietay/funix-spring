package com.manhnam.springdemoannotations;

import org.springframework.stereotype.Component;

@Component("randomFortuneService")
public class HappyFortuneService implements FortuneService {
  public String getFortune() {
    return "Today is your lucky day!";
  }
}
