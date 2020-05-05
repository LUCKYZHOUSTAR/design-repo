package com.lucky.dimite.change;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 13:52
 */
public class Wallet {

    private float value;
    public float getTotalMoney() {
        return value;
    }
    public void setTotalMoney(float newValue) {
        value = newValue;
    }
    public void addMoney(float deposit) {
        value += deposit;
    }
    public void subtractMoney(float debit) {
        value -= debit;
    }
}
