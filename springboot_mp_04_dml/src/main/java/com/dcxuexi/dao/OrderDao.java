package com.dcxuexi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dcxuexi.domain.Order;
import org.apache.ibatis.annotations.Mapper;

/***
 * @Title OrderDao
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/26 12:02
 * @Version 1.0.0
 */
@Mapper
public interface OrderDao extends BaseMapper<Order> {
}
