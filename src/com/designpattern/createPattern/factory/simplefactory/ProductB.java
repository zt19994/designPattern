package com.designpattern.createPattern.factory.simplefactory;

/**
 * 子类产品B
 *
 * @author zhongtao on 2018/9/11
 */
public class ProductB extends Product {
    public ProductB() {
        System.out.println("------产品B------");
    }

    @Override
    public void change() {
        System.out.println("------方法B------");
    }
}
