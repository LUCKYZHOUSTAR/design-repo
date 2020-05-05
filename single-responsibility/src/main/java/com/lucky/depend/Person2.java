package com.lucky.depend;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 12:59
 */
public class Person2 {

    private IVehicle vehicle;
    public void run() {
        vehicle.getInfo();

    }

    public void setVehicle(IVehicle vehicle) {
        this.vehicle = vehicle;
    }
}
