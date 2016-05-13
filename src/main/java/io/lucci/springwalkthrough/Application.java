package io.lucci.springwalkthrough;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.lucci.springwalkthrough.beans.BusinessLogic;
import io.lucci.springwalkthrough.beans.Counter;

public class Application {
	
	private static Log log = LogFactory.getLog("io.lucci.springwalkthrough.Application");
	
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
