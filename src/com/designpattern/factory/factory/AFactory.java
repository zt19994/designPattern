package com.designpattern.factory.factory;

/**
 * A工厂生产A产品
 *
 * @author zhongtao on 2018/9/11
 */
public class AFactory extends Factory {
    @Override
    public Product create() {
        return new ProductA();
    }
}
