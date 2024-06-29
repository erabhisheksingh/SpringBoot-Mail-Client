package com.springboot.demo;

import org.springframework.boot.SpringApplication;

public class TestSpringBootMailClientApplication {

  public static void main(String[] args) {
    SpringApplication.from(SpringBootMailClientApplication::main)
        .with(TestcontainersConfiguration.class).run(args);
  }
}
