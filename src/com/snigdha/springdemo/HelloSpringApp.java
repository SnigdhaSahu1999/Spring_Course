package com.snigdha.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		//Coach theTrackCoach = context.getBean("myCoach",Coach.class);
		
		//Coach theBaseballCoach = context.getBean("myCoach1",Coach.class);
		
		//Coach theBadmintonCoach = context.getBean("myCoach2",Coach.class);
		
		// call methods on the bean
		//System.out.println(theTrackCoach.getDailyWorkout());
		//System.out.println(theBaseballCoach.getDailyWorkout());
		//System.out.println(theBadmintonCoach.getDailyWorkout());
		
		
		//Call methods for Dependency Injection Demonstration
		Coach myTrackCoach = context.getBean("myTCoach",Coach.class);
		System.out.println(myTrackCoach.getDailyWorkout());
		System.out.println(myTrackCoach.getDailyFortune());
		// close the context
		context.close();
	}

}
