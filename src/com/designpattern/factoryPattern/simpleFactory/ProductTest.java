package com.designpattern.factoryPattern.simpleFactory;

import org.junit.Test;

/**
 * 比较普通创建对象的方法和测试简单工厂方法
 *
 * @author zhongtao on 2018/9/11
 */
public class ProductTest {

    /**
     * 没有工厂模式
     * 每个产品都需要创建
     */
    @Test
    public void test1(){
        ProductA productA = new ProductA();
        ProductB productB = new ProductB();
        ProductC productC = new ProductC();
        System.out.println("------productA------" + productA);
        System.out.println("------productB------" + productB);
        System.out.println("------productC------" + productC);
    }

    /**
     * 工厂设计
     * 参数不同,返回产品不同
     * 向下转型,和本身的类型相关
     */
    @Test
    public void test2(){
        ProductA productA = (ProductA) Factory.createProduct("A");
        ProductB productB = (ProductB) Factory.createProduct("B");
        ProductC productC = (ProductC) Factory.createProduct("C");
        System.out.println("------productA------" + productA);
        System.out.println("------productB------" + productB);
        System.out.println("------productC------" + productC);
        // 多态测试
        Factory.change(productA);
        Factory.change(productB);
        Factory.change(productC);
    }
}
