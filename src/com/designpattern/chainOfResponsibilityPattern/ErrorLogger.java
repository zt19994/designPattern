package com.designpattern.chainOfResponsibilityPattern;

/**
 * 具体责任处理者
 *
 * @author zhongtao on 2018/10/23
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("Error Console: logger->" + message);
    }
}
