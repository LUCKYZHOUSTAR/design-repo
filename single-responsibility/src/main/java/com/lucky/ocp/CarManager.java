package com.lucky.ocp;

/**
 * @description:使用方
 * @author: lucky
 * @created: 2020/05/05 13:22
 */
public class CarManager {

    public void run(Vehicle vehicle) {

        if (vehicle.type == 1) {

            runCar(vehicle);

        } else if (vehicle.type == 2) {

            runAirPlane(vehicle);
        }

    }

    public void runCar(Vehicle vehicle) {
        System.out.println("开汽车");
    }

    public void runAirPlane(Vehicle vehicle) {

        System.out.println("开飞机");
    }
}
