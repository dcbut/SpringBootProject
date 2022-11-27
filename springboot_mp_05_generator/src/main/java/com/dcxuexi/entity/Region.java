package com.dcxuexi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@Getter
@Setter
@TableName("platform_region")
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("country_code")
    private Integer countryCode;

    @TableField("country_name")
    private String countryName;

    @TableField("province_code")
    private Integer provinceCode;

    @TableField("province_name")
    private String provinceName;

    @TableField("area_code")
    private Integer areaCode;

    @TableField("area_name")
    private String areaName;

    @TableField("remark")
    private String remark;


}
