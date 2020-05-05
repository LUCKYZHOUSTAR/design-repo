package com.lucky.depend;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 13:00
 */
public class Car implements IVehicle {
    @Override
    public void getInfo() {
        System.out.println("小汽车");
    }
}
