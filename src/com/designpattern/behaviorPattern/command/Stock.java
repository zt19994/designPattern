package com.designpattern.behaviorPattern.command;

/**
 * @author zhongtao
 * @date 2023/5/28 14:44
 */
public class Stock {

    private String name = "商品ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + " ]bought ");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + " ]sold ");
    }
}
