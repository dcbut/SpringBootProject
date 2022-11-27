package com.dcxuexi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author DongChuang
 * @since 2022-11-26
 */
@Data
@TableName("platform_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    @TableField("email")
    private String email;

    @TableField("user_name")
    private String userName;

    @TableField("branch_name")
    private String branchName;

    @TableField("deleted")
    @TableLogic
    private Boolean deleted;

    @TableField("version")
    @Version
    private Boolean version;


}
