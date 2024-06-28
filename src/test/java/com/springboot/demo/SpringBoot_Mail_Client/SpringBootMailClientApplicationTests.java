package com.springboot.demo.SpringBoot_Mail_Client;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class SpringBootMailClientApplicationTests {

	@Test
	void contextLoads() {
	}

}
