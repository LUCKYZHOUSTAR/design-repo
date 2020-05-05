package com.lucky.demo.exception;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 14:31
 */
public class OrderException extends RuntimeException {

    private int errorCode;

    private String message;

    public OrderException() {
        super();
    }

    public OrderException(String message) {
        super(message);
    }

    public OrderException(String message, int errorCode, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public OrderException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderException(Throwable cause) {
        super(cause);
    }

}
