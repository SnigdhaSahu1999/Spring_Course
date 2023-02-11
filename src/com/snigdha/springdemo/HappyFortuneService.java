package com.snigdha.springdemo;

import java.util.Random;

//This class is for Dependency Injection Demonstration
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is your lucky day!";
	}
	
	//Practice Activity #2
	public String getRandomFortune() {
		String arr[] = {"Today is your best day!", "Best Of Luck!", "May you win the match."};
		Random random = new Random();
		int index = random.nextInt(arr.length);
		return (arr[index]);
	}

}
