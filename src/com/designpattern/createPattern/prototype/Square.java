package com.designpattern.createPattern.prototype;

/**
 * @author zhongtao
 * @date 2023/5/21 18:36
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}