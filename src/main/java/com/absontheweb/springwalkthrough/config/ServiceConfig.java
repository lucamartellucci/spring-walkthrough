package com.absontheweb.springwalkthrough.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={
	"com.absontheweb.springwalkthrough.service",
	"com.absontheweb.springwalkthrough.service.adapter"
})
public class ServiceConfig {

}
