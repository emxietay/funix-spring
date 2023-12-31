package com.manhnam.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan ("com.manhnam.springdemo")
public class SportConfig {
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
}
