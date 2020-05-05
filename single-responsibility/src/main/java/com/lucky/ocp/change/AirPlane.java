package com.lucky.ocp.change;

import com.lucky.ocp.Vehicle;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 13:22
 */
public class AirPlane extends AbstractVehicle {

    @Override
    public void run() {
        System.out.println("开飞机");
    }

    public AirPlane() {
        super.type = 2;
    }
}
