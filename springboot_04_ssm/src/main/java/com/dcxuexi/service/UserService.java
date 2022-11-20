package com.dcxuexi.service;

import com.dcxuexi.domain.User;

import java.util.List;

/***
 * @Title UserService
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/8 21:12
 * @Version 1.0.0
 */
public interface UserService {
    public Boolean save(User user);
    public Boolean update(User user);
    public Boolean delete(Integer userId);
    public User findByUserId(Integer userId);
    public List<User> findAll();
}
