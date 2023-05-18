package com.designpattern.behaviorPattern.mediator;

/**
 * 具体同事类B
 *
 * @author zhongtao on 2018/12/19
 */
public class ColleagueB extends Colleague {
    public ColleagueB(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void getMessage(String message) {
        System.out.println("同事B：" + name + " 获取信息：" + message);
    }

    public void contact(String message) {
        mediator.contact(message, this);
    }
}
