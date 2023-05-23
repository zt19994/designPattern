package com.designpattern.structurePattern.facade;

/**
 * @author zhongtao
 * @date 2023/5/23 21:24
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}