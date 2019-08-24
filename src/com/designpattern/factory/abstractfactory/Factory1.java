package com.designpattern.factory.abstractfactory;

/**
 * 具体工厂1
 * 生产产品A1和B1
 *
 * @author zhongtao on 2018/9/11
 */
public class Factory1 implements AbstractFactory {
    @Override
    public ProductA factoryA() {
        return new ProductA1();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB1();
    }
}
