package com.lucky.single;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 10:50
 */
public class Client {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("飞机");

        System.out.println("----------------------------------------------------------------------------------------------");


        //----------------------------------------------------------------------------------------------
        RodeVehicle rodeVehicle = new RodeVehicle();
        rodeVehicle.run("摩托车");
        rodeVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        System.out.println("----------------------------------------------------------------------------------------------");


        //按照功能的维护把类进行了拆解，实现了单一的原则，但是这样做对客户端修改的代码太多


        //----------------------------------------------------------------------------------------------

        VehicleTwo vehicleTwo = new VehicleTwo();

        vehicleTwo.runAir("飞机");
        vehicleTwo.runRoad("陆地");
        vehicleTwo.runWater("船");



        //这样修改后，对客户端影响最小，虽然没有实现类层面的单一职责，但是实现了方法级别的单一职责，每一个方法内部的功能单一
        //----------------------------------------------------------------------------------------------

    }
}
