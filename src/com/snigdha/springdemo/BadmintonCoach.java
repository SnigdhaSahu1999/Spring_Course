package com.snigdha.springdemo;

public class BadmintonCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	public BadmintonCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice badminton daily";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneService to get a fortune
		
		return "BadmintonCoach: "+fortuneService.getFortune();
	}
	
	//Practice Activity #2
	@Override
	public String getDailyRandomFortune() {
		//use my fortuneService to get a fortune
		
		return "BadmintonCoach: "+fortuneService.getRandomFortune();
	}
}
