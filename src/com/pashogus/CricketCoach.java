/**
 * 
 */
package com.pashogus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 540091
 *
 */

//@Component("coach") - definfing explicit bean id
//havent specifed bean id , so spring will create default Bean id as cricketCoach.. by just changing the first letter to small

@Component
public class CricketCoach implements Coach {

	private FortuneService service;
	
@Value("${email}")
 private String email;

/**
 * 
 */


@Value("${teamName}")
 private String teamName;


	
	/**
	 * @param service the service to set
	 */
	


	//Setter dependency Injection
	@Autowired
	public void setService(FortuneService service) {
		System.out.println("Ctricket Coach Class--"+"Insode Setter method");
		this.service = service;
		System.out.println("email id"+email);
		System.out.println("Team Name"+teamName);
	}  
	

 

	
	public CricketCoach()
	{
		System.out.println("Ctricket Coach Class--"+"inside Default Constructor");
	}
	


	@Override
	public String GetWorkout() {
		
		return "this is Cricket coach MEssage";
          
}
	
//Constructor Dependency Injection
@Autowired
	public CricketCoach(FortuneService fortune)
	{
	System.out.println("Ctricket Coach Class--"+"Inside Fortuen Service");
	System.out.println(fortune.getMessage());
	
	}  




//Autowired can be added to any method , to add it as dependency.. not only for seetter methods
@Autowired
public void getFortune(FortuneService services)
{
	service=services;
	System.out.println("Ctricket Coach Class--"+service.getMessage());
}

	

	
	/* (non-Javadoc)
	 * @see com.pashogus.Coach#getMessage()
	 */


	@Override
	public String getMessage() {
System.out.println("inside getmessafe method");
	return  service.getMessage();

	}




	}

