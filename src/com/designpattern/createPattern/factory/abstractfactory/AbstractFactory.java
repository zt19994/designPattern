package com.designpattern.createPattern.factory.abstractfactory;

/**
 * 抽象工厂类
 * 可以创建分别生产A、B产品
 *
 * @author zhongtao on 2018/9/11
 */
public interface AbstractFactory {

    ProductA factoryA();

    ProductB factoryB();
}
