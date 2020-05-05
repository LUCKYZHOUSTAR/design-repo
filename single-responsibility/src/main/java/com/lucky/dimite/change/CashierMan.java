package com.lucky.dimite.change;

/**
 * @description:收银员
 * @author: lucky
 * @created: 2020/05/05 13:52
 */
public class CashierMan {

    public void charge(Customer myCustomer, float payment) {
        myCustomer.pay(payment);
    }
}
