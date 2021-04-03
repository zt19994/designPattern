package com.designpattern.bridgePattern;

/**
 * 桥接模式测试类
 *
 * @author zt1994 2021/4/3 15:04
 */
public class BridgePatternTest {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
