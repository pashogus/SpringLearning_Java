/**
 * 
 */
package com.pashogus;

import org.springframework.stereotype.Component;

/**
 * @author 540091
 *
 */

@Component
public class FortuneService implements  FortuneServiceInterface {

	/* (non-Javadoc)
	 * @see com.pashogus.FortuneServiceInterface#getMessage()
	 */
	@Override
	public String getMessage() {
		
		return "hello hi";
	}



}
