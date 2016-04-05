package com.absontheweb.springwalkthrough.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;

public class BusinessLogic implements InitializingBean {
	
	/*
	 * NOTE
	 * The JSR-250 @PostConstruct and @PreDestroy annotations are generally considered 
	 * best practice for receiving lifecycle callbacks in a modern Spring application. 
	 * Using these annotations means that your beans are not coupled to Spring specific interfaces
	 */
	
	Log log = LogFactory.getLog("com.absontheweb.springwalkthrough.beans.BusinessLogic");
	
	private Counter counter;
	
	public int doVeryImportantBusinessLogic() {
		int value = counter.plusOne().plusOne().plusOne().get();
		log.info("counter is: " + value);
		return value;
	}

	public void setCounter(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("BusinessLogic is initialized");
	}

}
