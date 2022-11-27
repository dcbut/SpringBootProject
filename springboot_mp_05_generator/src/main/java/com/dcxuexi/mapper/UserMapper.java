package com.dcxuexi.mapper;

import com.dcxuexi.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author DongChuang
 * @since 2022-11-26
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    public List<User> selectInfo();
}
