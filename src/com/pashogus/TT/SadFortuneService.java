package com.pashogus.TT;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneServiceInterface {

	@Override
	public String getMessage() {
		
		return "Today is a Happy Day fro you ";
	}

}
