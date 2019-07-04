package com.pashogus.TT;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pashogus.ConfigClass;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FinalConfig.class);
		Coach love =context.getBean("TTCoach", Coach.class);
		System.out.println(love.GetWorkout());
		System.out.println(love.getMessage());
		context.close();

	}

}
