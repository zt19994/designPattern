package com.designpattern.structurePattern.decorator;

/**
 * 具体组件
 * @author zhongtao on 2018/10/23
 */
public class EuropeanStyle implements House {
    @Override
    public void style() {
        System.out.println("欧式风格装修");
    }
}
