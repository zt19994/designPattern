package com.designpattern.createPattern.prototype;

/**
 * @author zhongtao
 * @date 2023/5/21 18:36
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
