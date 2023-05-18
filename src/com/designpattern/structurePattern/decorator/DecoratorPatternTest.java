package com.designpattern.structurePattern.decorator;

import org.junit.Test;

/**
 * 测试装饰器模型
 *
 * @author zhongtao on 2018/10/22
 */
public class DecoratorPatternTest {
    /**
     * 测试装饰器模型
     */
    @Test
    public void testDecoratorPattern(){
        ChineseStyle chineseStyle = new ChineseStyle();
        House redChineseStyle = new RedDecorator(new ChineseStyle());
        House redEuropeanStyle = new RedDecorator(new EuropeanStyle());

        System.out.println("---中式装修---");
        chineseStyle.style();

        System.out.println("\n---中式加红色墙---");
        redChineseStyle.style();

        System.out.println("\n---欧式加红色墙---");
        redEuropeanStyle.style();

    }
}
