package com.designpattern.behaviorPattern.interpreter;

/**
 * @author zhongtao
 * @date 2023/5/31 10:34
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}