package io.lucci.springwalkthrough.todoweb.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.xpath;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import io.lucci.springwalkthrough.todoweb.config.ServiceConfigTest;
import io.lucci.springwalkthrough.todoweb.config.WebConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration ( classes = {ServiceConfigTest.class, WebConfig.class} )
@WebAppConfiguration
public class HelloControllerTest {
	
	@Autowired
	private WebApplicationContext context;

	private MockMvc mockMvc;

	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void testHelloWithParam() throws Exception {
		MockHttpServletRequestBuilder createMessage = get("/hello")
				.param("name", "Jack");
		
		mockMvc.perform(createMessage)
			.andExpect(status().is2xxSuccessful())
			.andExpect(xpath("//h2[@id='greetings']").exists())
			.andExpect(xpath("//h2[@id='greetings']/text()").string(is("Hello Jack!")));
	}
	
	@Test
	public void testHello() throws Exception {
		MockHttpServletRequestBuilder createMessage = get("/hello");
		
		mockMvc.perform(createMessage)
			.andExpect(status().is2xxSuccessful())
			.andExpect(xpath("//h2[@id='greetings']").exists())
			.andExpect(xpath("//h2[@id='greetings']/text()").string(is("Hello World!")));
	}
}


