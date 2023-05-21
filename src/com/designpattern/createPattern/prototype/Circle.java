package com.designpattern.createPattern.prototype;

/**
 * @author zhongtao
 * @date 2023/5/21 18:37
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
