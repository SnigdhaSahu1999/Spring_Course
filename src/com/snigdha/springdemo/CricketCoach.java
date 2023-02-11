package com.snigdha.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	
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

	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no arg constructor");
	}
	
	//setter method that will be called by spring for Dependency Injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
			
		return "Practise fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return "CricketCoach: "+fortuneService.getFortune();   
		//fortuneService.getFortune() calls getFortune() of HappyFortuneService class
	}

	@Override
	public String getDailyRandomFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
