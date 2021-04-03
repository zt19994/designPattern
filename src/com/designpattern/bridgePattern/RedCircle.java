package com.designpattern.bridgePattern;

/**
 * 画红圆实现类
 *
 * @author zt1994 2021/4/3 14:57
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
