package com.designpattern.structurePattern.facade;

/**
 * @author zhongtao
 * @date 2023/5/23 21:23
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}