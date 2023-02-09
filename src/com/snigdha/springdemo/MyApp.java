package com.snigdha.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create the object
		//BaseballCoach theCoach = new BaseballCoach();
		
		//Coach theCoach = new BaseballCoach();
		
		Coach theCoach = new TrackCoach();
		
		//use the object
		System.out.println(theCoach.getDailyWorkout());
		
	}

}
