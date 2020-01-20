package com.sphinx.dubbo.extention;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author sphinx
 * @date 2020-01-07
 * @description
 */
@SPI
public interface Car {

    String brand();
}