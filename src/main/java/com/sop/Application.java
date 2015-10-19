package com.sop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}