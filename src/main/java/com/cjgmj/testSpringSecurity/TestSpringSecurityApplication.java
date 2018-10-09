package com.cjgmj.testSpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TestSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringSecurityApplication.class, args);
	}
}
