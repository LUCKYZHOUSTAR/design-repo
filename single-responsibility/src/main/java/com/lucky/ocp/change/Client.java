package com.lucky.ocp.change;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 13:27
 */
public class Client {

    public static void main(String[] args) {
        CarManager carManager = new CarManager();

        carManager.run(new Car());


    }
}
