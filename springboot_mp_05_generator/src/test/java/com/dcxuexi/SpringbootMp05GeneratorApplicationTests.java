package com.dcxuexi;

import com.dcxuexi.entity.User;
import com.dcxuexi.mapper.UserMapper;
import com.dcxuexi.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMp05GeneratorApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
		List<User> userList = userService.selectInfo();
		userList.forEach(System.out::println);
	}

}
