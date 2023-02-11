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
		/*Coach myTrackCoach = context.getBean("myTCoach",Coach.class);
		System.out.println(myTrackCoach.getDailyWorkout());
		System.out.println(myTrackCoach.getDailyFortune());*/
		
		//Practice Activity #2
		/*Coach theBadmintonCoach = context.getBean("myCoach2",Coach.class);
		System.out.println(theBadmintonCoach.getDailyWorkout());
		System.out.println(theBadmintonCoach.getDailyFortune());
		System.out.println(theBadmintonCoach.getDailyRandomFortune());*/
		
		////Practice Activity #3
		Coach theBadmintonCoach = context.getBean("myCoach2",Coach.class);
		Coach theBadCoach = context.getBean("myCoach2",Coach.class);
		boolean result = (theBadmintonCoach == theBadCoach);
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theBadmintonCoach: "+ theBadmintonCoach);
		
		System.out.println("\nMemory location for theBadCoach: "+ theBadCoach + "\n"  );
		// close the context
		context.close();
	}

}
