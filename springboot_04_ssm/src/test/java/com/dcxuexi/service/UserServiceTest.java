package com.dcxuexi.service;

import com.dcxuexi.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/***
 * @Title UserServiceTest
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/20 12:13
 * @Version 1.0.0
 */
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetById(){
        User user = userService.findByUserId(10);
        System.out.println(user);
    }

    @Test
    public void testGetAll(){
        List<User> userList = userService.findAll();
        System.out.println(userList);
    }
}
