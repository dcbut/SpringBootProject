package com.dcxuexi.dao;

import com.dcxuexi.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/***
 * @Title UserDao
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/8 20:46
 * @Version 1.0.0
 */
@Mapper
public interface UserDao {

    @Insert("insert into platform_user (email,user_name,branch_name) values (#{email},#{userName},#{branchName})")
    public Boolean save(User user);

    @Update("update platform_user set email = #{email}, user_name=#{userName}, branch_name=#{branchName} where user_id = #{userId}")
    public Boolean update(User user);

    @Delete("delete from platform_user where user_id = #{userId}")
    public Boolean delete(Integer userId);

    @Select("select user_id as userId, email, user_name as userName, branch_name as branchName from platform_user where user_id = #{userId}")
    public User findByUserId(Integer userId);

    @Select("select user_id as userId, email, user_name as userName, branch_name as branchName from platform_user")
    public List<User> findAll();

}
