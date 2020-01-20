package com.sphinx.dubbo.extention;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

public class BenzTest {


    @Test
    public void test_dubbo_extention() {

        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
        Car benz = extensionLoader.getExtension("true");
        System.out.println(benz.brand());
    }

}