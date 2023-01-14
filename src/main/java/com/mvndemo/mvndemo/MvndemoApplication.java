package com.mvndemo.mvndemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MvndemoApplication extends SpringBootServletInitializer {
	
	private static final Logger logger = LoggerFactory.getLogger(MvndemoApplication.class);

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MvndemoApplication.class);
    }
 
	public static void main(String[] args) {
		
		  logger.info("this is a info message");
	      logger.warn("this is a warn message");
	      logger.error("this is a error message");
	      
		SpringApplication.run(MvndemoApplication.class, args);
		
		  logger.info("this is a info message");
	      logger.warn("this is a warn message");
	      logger.error("this is a error message");
	}
}