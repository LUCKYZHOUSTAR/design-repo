package com.lucky.segergation;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 12:15
 */
public class A {


    //A通过interface1依赖了Bimpl，D通过interface1依赖了CImpl，但是Interface1对A和D来说暴露了太多的方法，不是最小接口
    //应该进行隔离
    public void test1(Interface1 interface1) {
        interface1.method1();
    }

    public void test2(Interface1 interface1) {
        interface1.method2();

    }

    public void test3(Interface1 interface1) {
        interface1.method3();

    }
}
