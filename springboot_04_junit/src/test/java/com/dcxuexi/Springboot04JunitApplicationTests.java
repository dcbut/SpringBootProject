package com.dcxuexi;

import com.dcxuexi.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04JunitApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
		userService.findAll();
	}

}
