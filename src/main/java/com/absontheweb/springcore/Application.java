package com.absontheweb.springcore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.absontheweb.springcore.beans.BusinessLogic;
import com.absontheweb.springcore.beans.Counter;

public class Application {
	
	private static Logger log = LoggerFactory.getLogger("com.absontheweb.springcore.Application");
	
	public static void main(String[] args) {
		
		// create and configure beans
		try (ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext(new String[] {"application-context.xml"})) {
			
			Counter counter = context.getBean("counter", Counter.class);
			counter.plusOne();
			log.info("counter is: "+counter.get());
			
			BusinessLogic business = context.getBean("business", BusinessLogic.class);
			business.doVeryImportantBusinessLogic();
			
		}

	}

}
