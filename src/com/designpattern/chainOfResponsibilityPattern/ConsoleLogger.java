package com.designpattern.chainOfResponsibilityPattern;

/**
 * 扩展了该记录器类的实体类
 * 具体责任处理者
 * @author zhongtao on 2018/10/23
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("Standard Console: logger->" + message);
    }
}
