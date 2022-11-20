package com.dcxuexi.service.impl;

import com.dcxuexi.dao.UserDao;
import com.dcxuexi.domain.ResultCode;
import com.dcxuexi.domain.User;
import com.dcxuexi.exception.BusinessException;
import com.dcxuexi.exception.SystemException;
import com.dcxuexi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * @Title UserServiceImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/8 21:12
 * @Version 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public Boolean save(User user) {
        return userDao.save(user);
    }

    public Boolean update(User user) {
        return userDao.update(user);
    }

    public Boolean delete(Integer userId) {
        return userDao.delete(userId);
    }

    public User findByUserId(Integer userId) {
        //模拟业务异常，包装成自定义异常
//        if(userId == 10){
//            throw new BusinessException(ResultCode.BUSINESS_ERR,"请按要求请求参数!");
//        }
        //模拟系统异常，将可能出现的异常进行包装，转换成自定义异常
//        try{
//            int i = 20/0;
//        }catch (Exception e){
//            throw new SystemException(ResultCode.SYSTEM_TIMEOUT_ERR,"服务器访问超时，请重试!",e);
//        }

        return userDao.findByUserId(userId);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }
}
