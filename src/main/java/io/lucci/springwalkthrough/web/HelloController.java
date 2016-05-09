package io.lucci.springwalkthrough.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	private final static Logger logger = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping(method = RequestMethod.GET, path="/hello")
	public ModelAndView hello(@RequestParam("name") String name) throws Exception {

		logger.info("Serving request /hello with param name=[{}]", name);
		
		// prepare to render the view
		ModelAndView model = new ModelAndView("hello");
		model.addObject("name", name != null ? name : "World");
		return model;
	}
	
}
