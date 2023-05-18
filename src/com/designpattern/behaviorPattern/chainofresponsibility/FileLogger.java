package com.designpattern.behaviorPattern.chainofresponsibility;

/**
 * 具体责任处理者
 *
 * @author zhongtao on 2018/10/23
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("File : logger->" + message);
    }
}
