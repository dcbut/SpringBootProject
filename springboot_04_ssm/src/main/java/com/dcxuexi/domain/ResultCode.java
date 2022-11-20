package com.dcxuexi.domain;

/***
 * @Title Code
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/8 22:03
 * @Version 1.0.0
 */
//状态码
public class ResultCode {
    // 成功 状态
    public static final Integer SAVE_SUCCES = 200; //保存成功
    public static final Integer UPDATE_SUCCES = 200; //修改成功
    public static final Integer DELETE_SUCCES = 200; //删除成功
    public static final Integer SELECT_SUCCES = 200; //查询成功

    // 失败
    public static final Integer SAVE_FAIL = 2001;//保存失败
    public static final Integer UPDATE_FAIL = 2002;//修改失败
    public static final Integer DELETE_FAIL = 2003;//删除失败
    public static final Integer SELECT_FAIL = 2004;//查询失败

    // 其他 ......
    public static final Integer BUSINESS_ERR = -999;
    public static final Integer SYSTEM_TIMEOUT_ERR = -888;
    public static final Integer SYSTEM_UNKNOW_ERR = -10000;

}
