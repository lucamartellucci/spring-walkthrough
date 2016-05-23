package io.lucci.springwalkthrough.todoapi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={
	"io.lucci.springwalkthrough.todoapi.service",
	"io.lucci.springwalkthrough.todoapi.service.adapter"
})
public class ServiceConfig {

}
