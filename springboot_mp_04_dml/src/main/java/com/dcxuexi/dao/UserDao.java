package com.dcxuexi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dcxuexi.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/***
 * @Title UserDao
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/25 21:57
 * @Version 1.0.0
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

    //查询所有数据包含已经被删除的数据
    @Select("select * from platform_user")
    public List<User> selectAll();

}
