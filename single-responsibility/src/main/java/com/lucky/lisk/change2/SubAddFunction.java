package com.lucky.lisk.change2;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 13:11
 */
public class SubAddFunction extends Base {

    private AddFunction addFunction = new AddFunction();

    public int fun1(int a, int b) {
        return a - b;
    }

    public int fun2(int a, int b) {
        return a * b;
    }

    public int fun3(int a, int b) {
        return addFunction.fun1(a, b);
    }
}
