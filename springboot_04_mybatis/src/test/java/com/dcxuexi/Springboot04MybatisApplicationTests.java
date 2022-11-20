package com.dcxuexi;

import com.dcxuexi.dao.UserDao;
import com.dcxuexi.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04MybatisApplicationTests {

	@Autowired
	private UserDao userDao;

	@Test
	void contextLoads() {
		User user = userDao.findByUserId(10);
		System.out.println(user);
	}

}
