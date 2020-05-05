package com.lucky.demo.common;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 14:46
 */
public class OrderResult<T> {

    private Integer code;

    private String message;

    private T data;

    /**
     * 是否成功
     */
    private boolean success = true;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
