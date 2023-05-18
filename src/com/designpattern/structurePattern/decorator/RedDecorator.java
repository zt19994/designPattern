package com.designpattern.structurePattern.decorator;

/**
 * 具体装饰类
 *
 * @author zhongtao on 2018/10/23
 */
public class RedDecorator extends HouseDecorator {

    public RedDecorator(House house) {
        super(house);
    }

    public void style() {
        this.house.style();
        System.out.println("红色装饰墙");
    }
}
