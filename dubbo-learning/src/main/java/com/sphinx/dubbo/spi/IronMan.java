package com.sphinx.dubbo.spi;

/**
 * @author sphinx
 * @date 2020-01-03
 * @description
 */
public class IronMan implements Robot {


    @Override
    public void sayHello() {
        System.out.println("I am Iron Man.");
    }

}
