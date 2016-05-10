package io.lucci.springwalkthrough.todoweb.config;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.lucci.springwalkthrough.todoweb.client.TodoClient;

@Configuration
public class ServiceConfigTest {

	@Bean
	public TodoClient todoService(){
		return Mockito.mock( TodoClient.class );
	}
}
