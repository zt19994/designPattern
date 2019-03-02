package com.designpattern.chainOfResponsibilityPattern;

/**
 * 抽象日志类
 * Handler 处理者
 * 定义了处理请求的接口，handler知道，下一个处理者是谁，如果自己无法处理请求，就转给下一个处理者。
 *
 * @author zhongtao on 2018/10/23
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    private int level;

    public AbstractLogger(int level) {
        this.level = level;
    }

    private AbstractLogger nextLogger;

    /**
     * 指定下一个处理者
     *
     * @param nextLogger
     */
    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    abstract public void write(String message);

    public void logMessage(int level, String message) {
        if (this.level == level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
}
