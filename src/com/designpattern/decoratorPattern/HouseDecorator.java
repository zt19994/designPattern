package com.designpattern.decoratorPattern;

/**
 * 抽象装饰类
 *
 * @author zhongtao on 2018/10/23
 */
public class HouseDecorator implements House {

    public House house;

    public HouseDecorator(House house) {
        this.house = house;
    }

    @Override
    public void style() {
        house.style();
    }
}
