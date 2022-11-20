package com.dcxuexi.dao;

import com.dcxuexi.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/***
 * @Title UserDao
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/20 11:28
 * @Version 1.0.0
 */
@Mapper
public interface UserDao {

    @Select("select user_id as userId,email,user_name as userName, branch_name as branchName from platform_user where user_id = #{userId}")
    public User findByUserId(Integer userId);

}
