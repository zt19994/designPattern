package com.designpattern.bridgePattern;

/**
 * DrawAPI实现的抽象类shape
 *
 * @author zt1994 2021/4/3 15:00
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
