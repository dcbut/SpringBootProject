package com.dcxuexi.exception;

/***
 * @Title SystemException
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/9 23:11
 * @Version 1.0.0
 */
//自定义异常处理器，用于封装异常信息，对异常进行分类
public class SystemException extends RuntimeException {
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SystemException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SystemException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
