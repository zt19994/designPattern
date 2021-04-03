package com.designpattern.factory.factory;

import org.junit.Test;

/**
 * 测试工厂方法
 *
 * @author zhongtao on 2018/9/11
 */
public class FactoryMethodTest {
    /**
     * 创建不同的工厂，生产不同的产品
     */
    @Test
    public void test(){
        AFactory aFactory = new AFactory();
        Product product = aFactory.create();
        product.method();

        BFactory bFactory = new BFactory();
        Product product1 = bFactory.create();
        product1.method();
        /* 输出为:
        ------ProductA------
        ------ProductB------*/
    }
}
