package com.sphinx.dubbo;

import com.sphinx.dubbo.spi.Robot;
import org.junit.Test;

import java.util.ServiceLoader;

public class IronManTest {


    @Test
    public void test1() {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }

}