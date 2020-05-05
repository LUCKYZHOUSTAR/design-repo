package com.lucky.dimite.change;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 13:51
 */
public class Customer {

    private String firstName;
    private String lastName;
    private Wallet myWallet;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Wallet getWallet() {
        return myWallet;
    }

    public void pay(float payment) {
        Wallet theWallet = getWallet();
        if (theWallet.getTotalMoney() > payment) {
            theWallet.subtractMoney(payment);
        } else {
            //money not enough
        }
    }
}
