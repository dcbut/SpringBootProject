package com.dcxuexi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
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
@TableName("platform_mobile_belong")
public class MobileBelong implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("Mobile")
    private String mobile;

    @TableField("beginnum")
    private String beginnum;

    @TableField("endnum")
    private String endnum;

    @TableField("sys_areaid")
    private Integer sysAreaid;

    @TableField("country_code")
    private Integer countryCode;

    @TableField("country")
    private String country;

    @TableField("province_code")
    private Integer provinceCode;

    @TableField("province")
    private String province;

    @TableField("area_code")
    private Integer areaCode;

    @TableField("area")
    private String area;

    @TableField("operator")
    private Integer operator;

    @TableField("operator_name")
    private String operatorName;

    @TableField("status")
    private Boolean status;

    @TableField("add_time")
    private LocalDateTime addTime;


}
