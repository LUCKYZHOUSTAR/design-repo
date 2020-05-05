package com.lucky.demo.bo;

import java.math.BigDecimal;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 15:08
 */
public class OrderRequestBo {

    private String userName;

    private String userId;

    private BigDecimal totalAmount;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
