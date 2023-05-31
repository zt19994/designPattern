package com.designpattern.behaviorPattern.interpreter;

/**
 * @author zhongtao
 * @date 2023/5/31 10:31
 */
public interface Expression {
    public boolean interpret(String context);
}
