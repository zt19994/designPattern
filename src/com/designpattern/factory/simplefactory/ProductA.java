package com.designpattern.factory.simplefactory;

/**
 * 子类产品A
 * @author zhongtao on 2018/9/11
 */
public class ProductA extends Product {
    public ProductA() {
        System.out.println("------产品A------");
    }

    @Override
    public void change() {
        System.out.println("------方法A------");
    }
}
