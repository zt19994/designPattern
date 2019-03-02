package com.designpattern.factoryPattern.simpleFactory;

/**
 * 子类产品C
 * @author zhongtao on 2018/9/11
 */
public class ProductC extends Product {
    public ProductC() {
        System.out.println("------产品C------");
    }

    @Override
    public void change() {
        System.out.println("------方法C------");
    }
}
