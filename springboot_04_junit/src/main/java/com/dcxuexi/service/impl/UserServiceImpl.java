package com.dcxuexi.service.impl;

import com.dcxuexi.service.UserService;
import org.springframework.stereotype.Service;

/***
 * @Title UserServiceImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/20 11:12
 * @Version 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void findAll() {
        System.out.println("UserServiceImpl findAll, running ......");
    }

}
