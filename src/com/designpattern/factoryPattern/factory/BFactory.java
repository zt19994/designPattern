package com.designpattern.factoryPattern.factory;

/**
 * B工厂生产B产品
 *
 * @author zhongtao on 2018/9/11
 */
public class BFactory extends Factory {
    @Override
    Product create() {
        return new ProductB();
    }
}
