package com.designpattern.factoryPattern.factory;

/**
 * 具体产品A
 *
 * @author zhongtao on 2018/9/11
 */
public class ProductA implements Product {
    @Override
    public void method() {
        System.out.println("------ProductA------");
    }
}
