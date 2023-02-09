package com.snigdha.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no arg constructor");
	}
	
	//setter method that will be called by spring for Dependency Injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method");
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
			
		return "Practise fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return "CricketCoach: "+fortuneService.getFortune();
	}

}
