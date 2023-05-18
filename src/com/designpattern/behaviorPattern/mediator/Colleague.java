package com.designpattern.behaviorPattern.mediator;

/**
 * 抽象同事类
 *
 * @author zhongtao on 2018/12/19
 */
public class Colleague {

    protected String name;
    protected Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
