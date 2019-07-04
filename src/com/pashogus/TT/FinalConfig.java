package com.pashogus.TT;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.pashogus.TT")
@PropertySource("classpath:Property.properties")
public class FinalConfig {

	
//	@Bean
//	public SadFortuneService service()
//	{
//		return new SadFortuneService();
//	}
//	
//	@Bean Coach ttCoach()
//	{
//		Coach tt = new TTCoach(service());
//		return tt;
//		
//	}
}
