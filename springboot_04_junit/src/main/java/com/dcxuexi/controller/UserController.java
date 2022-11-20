package com.dcxuexi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @Title UserController
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/20 11:08
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public String getById(@PathVariable int id){
        System.out.println("userController getById, running ......");
        System.out.println("id ====> " + id);
        return "userController getById running , id ===> " + id;
    }
}
