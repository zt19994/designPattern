package com.designpattern.behaviorPattern.strategy;

/**
 * 加法实现类
 *
 * @author zt1994 2021/4/3 17:42
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
