package com.lucky.ocp.change;

import com.lucky.ocp.Vehicle;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 13:21
 */
public class Car extends AbstractVehicle {

    @Override
    public void run() {
        System.out.println("开汽车");
    }

    public Car() {
        super.type = 1;
    }
}
