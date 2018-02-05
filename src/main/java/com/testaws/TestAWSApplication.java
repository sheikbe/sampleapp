package com.testaws;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;


@SpringBootApplication
@EnableAutoConfiguration
public class TestAWSApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestAWSApplication.class, args);
	}
	
}
