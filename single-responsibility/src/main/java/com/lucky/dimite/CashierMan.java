package com.lucky.dimite;

/**
 * @description:收银员
 * @author: lucky
 * @created: 2020/05/05 13:52
 */
public class CashierMan {

    public void charge(Customer myCustomer, float payment) {
        Wallet theWallet = myCustomer.getWallet();
        if (theWallet.getTotalMoney() > payment) {
            theWallet.subtractMoney(payment);
        } else {
            //money not enough
        }
    }
}
