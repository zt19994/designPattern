package com.designpattern.behaviorPattern.mediator;

/**
 * 具体中介类
 *
 * @author zhongtao on 2018/12/19
 */
public class ConcreteMediator extends Mediator {

    private ColleagueA colleagueA;
    private ColleagueB colleagueB;

    public ColleagueA getColleagueA() {
        return colleagueA;
    }

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public ColleagueB getColleagueB() {
        return colleagueB;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void contact(String content, Colleague colleague) {
        if (colleague == colleagueA) {
            colleagueB.getMessage(content);
        } else {
            colleagueA.getMessage(content);
        }
    }
}
