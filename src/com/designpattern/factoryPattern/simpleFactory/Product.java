package com.designpattern.factoryPattern.simpleFactory;

/**
 * 父类产品
 *
 * @author zhongtao on 2018/9/11
 */
public class Product {
    public Product() {
        System.out.println("------product------");
    }

    public void change() {
        System.out.println("-----父类方法------");
    }
}
