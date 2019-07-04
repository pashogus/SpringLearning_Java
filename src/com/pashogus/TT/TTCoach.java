package com.pashogus.TT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TTCoach implements Coach {

	@Value("${email}")
	private String email;
	
	
	private FortuneServiceInterface FortuneServiceInterface;
	
	@Autowired
	public TTCoach(FortuneServiceInterface fortuneServiceInterface)
	{
		FortuneServiceInterface=fortuneServiceInterface;
	}
	
	@Override
	public String GetWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		System.out.println("Email Address "+email);
		return FortuneServiceInterface.getMessage();
		
	}

}
