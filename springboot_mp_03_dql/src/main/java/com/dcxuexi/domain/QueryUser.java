package com.dcxuexi.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * @Title QueryUser
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/24 20:33
 * @Version 1.0.0
 */
@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@TableName(value = "platform_user")
public class QueryUser extends User {
    private Integer userId2;
}
