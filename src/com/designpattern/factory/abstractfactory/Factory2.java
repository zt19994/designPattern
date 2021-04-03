package com.designpattern.factory.abstractfactory;

/**
 * 具体工厂2
 * 生产产品A2和B2
 *
 * @author zhongtao on 2018/9/11
 */
public class Factory2 implements AbstractFactory {
    @Override
    public ProductA factoryA() {
        return new ProductA2();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB2();
    }
}
