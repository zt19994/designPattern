package com.designpattern.structurePattern.bridge;

/**
 * 画绿圆实现类
 *
 * @author zt1994 2021/4/3 14:57
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
