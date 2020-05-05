package com.lucky.depend;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 13:01
 */
public class Client {

    public static void main(String[] args) {
        Person p = new Person();
        p.run(new AirPlane());
        
    }
}
