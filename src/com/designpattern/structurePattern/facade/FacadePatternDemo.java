package com.designpattern.structurePattern.facade;

/**
 * @author zhongtao
 * @date 2023/5/23 21:24
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}