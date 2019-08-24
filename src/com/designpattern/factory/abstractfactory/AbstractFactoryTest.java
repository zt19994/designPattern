package com.designpattern.factory.abstractfactory;

import org.junit.Test;

/**
 * 测试抽象工厂
 *
 * @author zhongtao on 2018/9/11
 */
public class AbstractFactoryTest {
    /**
     * 测试抽象工厂
     */
    @Test
    public void test(){
        Factory1 factory1 = new Factory1();
        factory1.factoryA();
        factory1.factoryB();

        Factory2 factory2 = new Factory2();
        factory2.factoryA();
        factory2.factoryB();
        /* 输出
        ------ProductA1------
        ------ProductB1------
        ------ProductA2------
        ------ProductB2------*/
    }
}
