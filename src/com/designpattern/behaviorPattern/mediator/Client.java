package com.designpattern.behaviorPattern.mediator;

/**
 * 客户端 测试中介者模式
 *
 * @author zhongtao on 2018/12/19
 */
public class Client {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ColleagueA peter = new ColleagueA("Peter", mediator);
        ColleagueB lina = new ColleagueB("Lina", mediator);

        mediator.setColleagueA(peter);
        mediator.setColleagueB(lina);

        peter.contact("我是peter，想请lina晚上看电影");
        lina.contact("我是lina，可以滴");
    }
}
