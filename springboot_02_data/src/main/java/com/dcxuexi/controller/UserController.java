package com.dcxuexi.controller;

import com.dcxuexi.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @Title UserController
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/18 20:32
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

//    @Value("${user.name}")
//    private String name;
//    @Value("${user.age}")
//    private Integer age;
//    @Value("${user.tel}")
//    private String tel;
//    @Value("${user.sex}")
//    private String sex;

//    @Autowired
//    private Environment env;

    @Autowired
    private User user;

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("userController getById, running ......");
        System.out.println("id ====> " + id);
        //System.out.println("name ====> " + name);
        //System.out.println("name ====> " + env.getProperty("user.name"));
        System.out.println("name ====> " + user.getName());
        //System.out.println("age ====> " + age);
        //System.out.println("age ====> " + env.getProperty("user.age"));
        System.out.println("age ====> " + user.getAge());
        //System.out.println("tel ====> " + tel);
        //System.out.println("tel ====> " + env.getProperty("user.tel"));
        System.out.println("tel ====> " + user.getTel());
        //System.out.println("sex ====> " + sex);
        //System.out.println("sex ====> " + env.getProperty("user.sex"));
        System.out.println("sex ====> " + user.getSex());
        return "userController getById running , id ===> " + id;
    }

}
