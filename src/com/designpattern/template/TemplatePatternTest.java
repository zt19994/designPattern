package com.designpattern.template;

/**
 * 模板模式测试类
 *
 * @author zt1994 2021/4/3 15:44
 */
public class TemplatePatternTest {

    public static void main(String[] args) {
        AbstractGame game = new Cricket();
        game.play();
        System.out.println("------");
        game = new Football();
        game.play();
    }
}
