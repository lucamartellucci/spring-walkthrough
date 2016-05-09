package io.lucci.springwalkthrough.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={
	"io.lucci.springwalkthrough.service",
	"io.lucci.springwalkthrough.service.adapter"
})
public class ServiceConfig {

}
