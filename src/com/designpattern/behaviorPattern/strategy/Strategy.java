package com.designpattern.behaviorPattern.strategy;

/**
 * 策略模式接口
 *
 * @author zt1994 2021/4/3 17:39
 */
public interface Strategy {

    /**
     * 操作
     *
     * @param num1
     * @param num2
     * @return
     */
    int doOperation(int num1, int num2);
}
