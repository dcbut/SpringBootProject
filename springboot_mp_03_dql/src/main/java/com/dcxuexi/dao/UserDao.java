package com.dcxuexi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dcxuexi.domain.User;
import org.apache.ibatis.annotations.Mapper;

/***
 * @Title UserDao
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/22 21:51
 * @Version 1.0.0
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
