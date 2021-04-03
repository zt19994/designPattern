package com.designpattern.strategy;

/**
 * 减法实现类
 *
 * @author zt1994 2021/4/3 17:43
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
