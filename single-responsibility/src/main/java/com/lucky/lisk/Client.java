package com.lucky.lisk;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 13:12
 */
public class Client {
    public static void main(String[] args) {
        AddFunction addFunction = new AddFunction();
        addFunction.fun1(1, 1);

        SubAddFunction subAddFunction = new SubAddFunction();

        subAddFunction.fun1(3, 5);

    }
}
