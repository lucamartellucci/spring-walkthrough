package io.lucci.springwalkthrough.todoapi.config;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Application {
	
	public static void main(String[] args) {
	    SpringApplication app = new SpringApplication(Application.class);
	    app.setBannerMode(Banner.Mode.LOG);
	    app.run(args);
    }

}
