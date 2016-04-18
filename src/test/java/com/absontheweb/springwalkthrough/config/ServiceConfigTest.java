package com.absontheweb.springwalkthrough.config;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.absontheweb.springwalkthrough.service.TodoService;

@Configuration
public class ServiceConfigTest {

	@Bean
	public TodoService todoService(){
		return Mockito.mock( TodoService.class );
	}
}
