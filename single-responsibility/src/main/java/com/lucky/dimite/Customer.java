package com.lucky.dimite;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 13:51
 */
public class Customer {

    private String firstName;
    private String lastName;
    private Wallet myWallet;
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Wallet getWallet(){
        return myWallet;
    }
}
