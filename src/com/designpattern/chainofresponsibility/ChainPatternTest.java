package com.designpattern.chainofresponsibility;

import org.junit.Test;

/**
 * 测试责任链模式
 *
 * @author zhongtao on 2018/10/23
 */
public class ChainPatternTest {

    @Test
    public void testChainPattern() {
        AbstractLogger loggerChain = ChainDemo.getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information");
    }
}
