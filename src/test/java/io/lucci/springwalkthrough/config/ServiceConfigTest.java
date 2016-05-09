package io.lucci.springwalkthrough.config;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.lucci.springwalkthrough.service.TodoService;

@Configuration
public class ServiceConfigTest {

	@Bean
	public TodoService todoService(){
		return Mockito.mock( TodoService.class );
	}
}
