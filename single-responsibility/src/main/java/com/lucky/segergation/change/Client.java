package com.lucky.segergation.change;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 12:36
 */
public class Client {

    public static void main(String[] args) {
        A a = new A();
        a.test1(new BImple());

        a.test2(new BImple());

        D d = new D();

        d.test1(new CImple());
        d.test4(new CImple());
    }
}
