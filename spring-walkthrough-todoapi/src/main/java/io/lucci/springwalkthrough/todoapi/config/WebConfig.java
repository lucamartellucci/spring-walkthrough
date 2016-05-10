package io.lucci.springwalkthrough.todoapi.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan(basePackages={
	"io.lucci.springwalkthrough.todoapi.web"
})
@EnableWebMvc
@EnableAutoConfiguration
public class WebConfig extends WebMvcConfigurerAdapter {

	private String staticPathPattern = "/**";

	private Integer cachePeriod = 31556926;
	
	private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
			"classpath:/META-INF/resources/", "classpath:/resources/",
			"classpath:/static/", "classpath:/public/" };
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    if (!registry.hasMappingForPattern("/webjars/**")) {
	        registry.addResourceHandler("/webjars/**")
	        	.addResourceLocations("classpath:/META-INF/resources/webjars/")
	        	.setCachePeriod(cachePeriod);
	    }
	    if (!registry.hasMappingForPattern(staticPathPattern)) {
				registry.addResourceHandler(staticPathPattern)
					.addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS)
					.setCachePeriod(cachePeriod);
		}
	    
	}
   
}