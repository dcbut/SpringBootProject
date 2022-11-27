package com.dcxuexi.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/***
 * @Title User
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/25 21:57
 * @Version 1.0.0
 */
@Data
//@TableName(value = "user") //可以不写是因为配置了全局配置
public class User {
    @TableId(type = IdType.AUTO)
    private Integer userId;
    private String email;
    private String userName;
    private String branchName;

    //value为正常数据的值，delval为删除数据的值
    @TableLogic(value = "0",delval = "1")
    private Integer deleted;

    @Version
    private Integer version;

}
