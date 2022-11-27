package com.dcxuexi.service.impl;

import com.dcxuexi.entity.User;
import com.dcxuexi.mapper.UserMapper;
import com.dcxuexi.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author DongChuang
 * @since 2022-11-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectInfo() {
        return userMapper.selectInfo();
    }
}
