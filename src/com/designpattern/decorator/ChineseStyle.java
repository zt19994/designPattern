package com.designpattern.decorator;

/**
 * 具体组件
 * @author zhongtao on 2018/10/23
 */
public class ChineseStyle implements House {
    @Override
    public void style() {
        System.out.println("中式风格装修");
    }
}
