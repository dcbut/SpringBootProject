package com.dcxuexi.domain;

import lombok.Data;

/***
 * @Title Result
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/8 21:59
 * @Version 1.0.0
 */
@Data
public class Result {
    //描述统一格式中的数据
    private Object data;
    //描述统一格式中的编码，用于区分操作，可以简化配置0或1表示成功失败
    private Integer code;
    //描述统一格式中的消息，可选属性
    private String msg;

    public Result() {
    }

    public Result(Object data, Integer code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public Result(Object data, Integer code) {
        this.data = data;
        this.code = code;
    }
}
