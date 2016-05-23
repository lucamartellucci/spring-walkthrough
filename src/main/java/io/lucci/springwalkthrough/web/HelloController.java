package io.lucci.springwalkthrough.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {
	
	private final static Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get the parameter from query string
		String nameParam = request.getParameter("name");
		logger.info("Serving request /hello with param name=[{}]", nameParam);
		
		// prepare to render the view
		ModelAndView model = new ModelAndView("hello");
		model.addObject("name", nameParam != null ? nameParam : "World");
		return model;
	}
	
}
