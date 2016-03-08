package com.absontheweb.springcore.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BusinessLogic {
	
	Log log = LogFactory.getLog("com.absontheweb.springcore.beans.BusinessLogic");
	
	private Counter counter;
	
	public int doVeryImportantBusinessLogic() {
		int value = counter.plusOne().plusOne().plusOne().get();
		log.info("counter is: " + value);
		return value;
	}

	public void setCounter(Counter counter) {
		this.counter = counter;
	}

}
