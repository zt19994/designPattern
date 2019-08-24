package com.designpattern.builder;

/**
 * 聪明的人
 *
 * @author zhongtao on 2018/9/17
 */
public class SmartHumanBuilder implements BuilderHuman {

    Human human;

    public SmartHumanBuilder() {
        human = new Human();
    }

    @Override
    public void buildHead() {
        human.setHead("高智商的头脑");
    }

    @Override
    public void buildBody() {
        human.setBody("健康的身体");
    }

    @Override
    public void buildHand() {
        human.setHand("普通的手");
    }

    @Override
    public void buildFoot() {
        human.setFoot("普通的脚");
    }

    @Override
    public Human createHuman() {
        return human;
    }
}
