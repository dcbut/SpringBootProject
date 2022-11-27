package com.dcxuexi.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * @Title User
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/22 21:51
 * @Version 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "platform_user")
public class User {
    @TableId(type = IdType.AUTO)
    private Integer userId;

    @TableField(select = false)
    private String email; //不查询该字段

    private String userName;

    @TableField(value = "branch_name")
    private String company;

    @TableField(exist = false)
    private String address; //该字段数据表中不存在
}

