package com.snigdha.springdemo;

//This class is for Dependency Injection Demonstration
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day!";
	}

}
