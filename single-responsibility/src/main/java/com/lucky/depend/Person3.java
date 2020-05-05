package com.lucky.depend;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 12:59
 */
public class Person3 {
    private IVehicle vehicle;

    Person3(IVehicle vehicle) {
        this.vehicle = vehicle;
    }


    public void run() {
        vehicle.getInfo();

    }

}
