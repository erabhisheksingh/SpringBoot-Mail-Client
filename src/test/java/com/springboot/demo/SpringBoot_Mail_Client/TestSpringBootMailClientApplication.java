package com.springboot.demo.SpringBoot_Mail_Client;

import org.springframework.boot.SpringApplication;

public class TestSpringBootMailClientApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringBootMailClientApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
