package com.designpattern.factory.simplefactory;

/**
 * 创建产品的工厂
 *
 * @author zhongtao on 2018/9/11
 */
public class Factory {
    /**
     * 静态方法,直接调用
     * 自动向上转型,转为product
     */
    public static Product createProduct(String param) {
        if (param.equals("A")) {
            Product productA = new ProductA();
            return productA;
        } else if (param.equals("B")) {
            Product productB = new ProductB();
            return productB;
        } else if (param.equals("C")) {
            ProductC productC = new ProductC();
            return productC;
        }
        return new Product();
    }

    public static void change(Product product) {
        product.change();
    }
}
