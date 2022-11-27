package com.dcxuexi.domain;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

/***
 * @Title Order
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/26 12:01
 * @Version 1.0.0
 */
@Mapper
@Data
public class Order {
    private  Integer id;
    private String name;

}
