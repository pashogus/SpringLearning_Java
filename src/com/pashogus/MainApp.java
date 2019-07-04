package com.pashogus;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Coach Cricket =context.getBean("cricketCoach", Coach.class);
		System.out.println(Cricket.GetWorkout());
		System.out.println(Cricket.getMessage());
		context.close();

	}

}
