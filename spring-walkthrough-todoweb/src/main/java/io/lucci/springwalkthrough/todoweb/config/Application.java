package io.lucci.springwalkthrough.todoweb.config;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages={"io.lucci.springwalkthrough.todoweb.client"})
public class Application {
	
	public static void main(String[] args) {
	    SpringApplication app = new SpringApplication(Application.class);
	    app.setBannerMode(Banner.Mode.LOG);
	    app.run(args);
    }

}
