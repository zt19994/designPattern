package com.designpattern.builder;

/**
 * 高个子的人
 *
 * @author zhongtao on 2018/9/17
 */
public class TallPersonBuilder implements BuilderHuman {

    Human human;

    public TallPersonBuilder() {
        human = new Human();
    }

    @Override
    public void buildHead() {
        human.setHead("普通的头脑");
    }

    @Override
    public void buildBody() {
        human.setBody("壮实，高大的身体");
    }

    @Override
    public void buildHand() {
        human.setHand("长手");
    }

    @Override
    public void buildFoot() {
        human.setFoot("长脚");
    }

    @Override
    public Human createHuman() {
        return human;
    }
}
