package com.designpattern.structurePattern.facade;

/**
 * @author zhongtao
 * @date 2023/5/23 21:23
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
