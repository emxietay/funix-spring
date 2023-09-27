package com.manhnam.springdemoannotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}


	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}

	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
	}


	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDaylyFortune() {
		return fortuneService.getFortune();
	}
}
