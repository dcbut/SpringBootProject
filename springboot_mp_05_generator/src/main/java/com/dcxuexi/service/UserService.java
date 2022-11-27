package com.dcxuexi.service;

import com.dcxuexi.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author DongChuang
 * @since 2022-11-26
 */
public interface UserService extends IService<User> {
    public List<User> selectInfo();

}
