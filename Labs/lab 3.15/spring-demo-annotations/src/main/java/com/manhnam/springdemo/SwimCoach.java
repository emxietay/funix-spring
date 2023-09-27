package com.manhnam.springdemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public SwimCoach() {
		System.out.println("SwimCoach: inside default constructor");
	}




	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String getDaylyFortune() {
		return fortuneService.getFortune();
	}
}
