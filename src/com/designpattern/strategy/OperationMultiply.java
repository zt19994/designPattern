package com.designpattern.strategy;

/**
 * 乘法实现类
 *
 * @author zt1994 2021/4/3 17:44
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
