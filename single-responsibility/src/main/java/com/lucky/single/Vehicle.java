package com.lucky.single;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 10:38
 */
public class Vehicle {

    /**
     * 该方法就违反了单一职责原则
     * 1.方法包装的太大了，什么车辆都可以在陆地上允许，如果参数传递了飞机呢？不伦不类了。
     * 2.所以可以按照车辆功能的纬度对该类进行拆解
     *
     * @param name
     * @return
     */
    public void run(String name) {
        System.out.println(name+"在陆地上运行");
    }

}
