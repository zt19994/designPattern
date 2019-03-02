package com.designpattern.builderPatterns;

import org.junit.Test;

/**
 * 测试
 *
 * @author zhongtao on 2018/9/17
 */
public class BuilderPatternTest {

    /**
     * 测试建造者模式
     */
    @Test
    public void test() {
        HumanDirector humanDirector = new HumanDirector();
        //创建高个子的人
        Human humanByDirector = humanDirector.createHumanByDirector(new TallPersonBuilder());
        System.out.println(humanByDirector.getHead());
        System.out.println(humanByDirector.getBody());
        System.out.println(humanByDirector.getHand());
        System.out.println(humanByDirector.getFoot());

        System.out.println("------简单的分割线------");
        //创建聪明的人
        Human smartHuman = humanDirector.createHumanByDirector(new SmartHumanBuilder());
        System.out.println(smartHuman.getHead());
        System.out.println(smartHuman.getBody());
        System.out.println(smartHuman.getHand());
        System.out.println(smartHuman.getFoot());
    }
}
