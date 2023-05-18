package com.designpattern.structurePattern.bridge;

/**
 * 桥接模式 画图类接口
 *
 * @author zt1994 2021/4/3 14:55
 */
public interface DrawAPI {

    /**
     * 画圆
     *
     * @param radius
     * @param x
     * @param y
     */
    void drawCircle(int radius, int x, int y);
}
