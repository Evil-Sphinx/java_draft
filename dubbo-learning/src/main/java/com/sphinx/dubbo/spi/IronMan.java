package com.sphinx.dubbo.spi;

import java.util.ServiceLoader;

/**
 * @author sphinx
 * @date 2020-01-03
 * @description
 */
public class IronMan implements Robot {


    @Override
    public String sayHello() {
        return "I am Iron Man.";
    }


    public static void main(String[] args) {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }
}
